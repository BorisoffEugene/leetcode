import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(preorderTraversal(new TreeNode(new Integer[]{1,null,2,3})));
        System.out.println(preorderTraversal(new TreeNode(new Integer[]{1,2,3,4,5,null,8,null,null,6,7,9})));
        System.out.println(preorderTraversal(new TreeNode(new Integer[]{1})));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversalToList(root, res);
        return res;
    }

    public static void preorderTraversalToList(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);
        preorderTraversalToList(node.left, list);
        preorderTraversalToList(node.right, list);
    }
}