public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {3,9,20,null,null,15,7});
        System.out.println(sumOfLeftLeaves(root));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null ) return 0;
        return left(root.left) + right(root.right);
    }

    public static int left(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;

        return left(root.left) + right(root.right);
    }

    public static int right(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;

        return left(root.left) + right(root.right);
    }
}