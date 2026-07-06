import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {1,2,3,4,5,6,7});
        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;

        add(root, new StringBuilder(), res);
        return res;
    }

    public static void add(TreeNode node, StringBuilder sb, List<String> res) {
        int len = sb.length();
        sb.append(node.val);

        if (node.right == null && node.left == null)
            res.add(sb.toString());
        else {
            sb.append("->");
            if (node.left != null) add(node.left, sb, res);
            if (node.right != null) add(node.right, sb, res);
        }

        sb.setLength(len);
    }
}