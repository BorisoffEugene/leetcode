public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{3,4,5,1,2});
        TreeNode subRoot = TreeNode.fromArr(new Integer[]{4,1,2});

        System.out.println(isEqual(root, subRoot));
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (isEqual(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isEqual(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;

        if (n1 == null || n2 == null || n1.val != n2.val) return false;

        return isEqual(n1.left, n2.left) && isEqual(n1.right, n2.right);
    }
}