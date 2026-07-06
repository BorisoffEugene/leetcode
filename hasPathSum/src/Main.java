public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {});
        System.out.println(hasPathSum(root, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        targetSum = targetSum - root.val;
        if (root.left == null && root.right == null)
            return targetSum == 0;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}