public class Main {
    private static int max;
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {1,2,3,4,5});
        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        calc(root);
        return max;
    }

    public static int calc(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = calc(node.left);
        int rightHeight = calc(node.right);
        max = Math.max(max, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}