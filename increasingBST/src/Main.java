import java.util.Arrays;

public class Main {
    private static TreeNode[] nodes;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,7,9});
        System.out.println(increasingBST(root));
    }

    public static TreeNode increasingBST(TreeNode root) {
        nodes = new TreeNode[1001];
        fillNodes(root);

        TreeNode dummy = new TreeNode();
        TreeNode curr = dummy;

        for (TreeNode node : nodes)
            if (node != null) {
                node.left = null;
                curr.right = node;
                curr = node;
            }

        curr.right = null;
        return dummy.right;
    }

    public static void fillNodes(TreeNode node) {
        if (node == null) return;

        nodes[node.val] = node;

        fillNodes(node.left);
        fillNodes(node.right);
    }
}