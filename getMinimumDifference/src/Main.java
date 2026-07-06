public class Main {
    private static int minDiff = Integer.MAX_VALUE;
    private static Integer prev = null;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {236,104,701,null,227,null,911});
        System.out.println(getMinimumDifference(root));
    }

    public static int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    public static void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != null)
            minDiff = Math.min(minDiff, node.val - prev);

        prev = node.val;

        inorder(node.right);
    }
}