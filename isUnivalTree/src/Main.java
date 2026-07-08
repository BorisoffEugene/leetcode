public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{1,1,1,1,1,null,1});
        System.out.println(isUnivalTree(root));
    }

    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;

        return isEqual(root, root.val);
    }

    public static boolean isEqual(TreeNode node, int val) {
        if (node == null) return true;
        if (node.val != val) return false;

        return isEqual(node.left, node.val) && isEqual(node.right, node.val);
    }
}