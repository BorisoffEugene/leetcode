public class Main {
    public static void main(String[] args) {
        System.out.println(isSymmetric(new TreeNode(new Integer[]{1,2,2,3,4,4,3})));
        System.out.println(isSymmetric(new TreeNode(new Integer[]{1,2,2,null,3,null,3})));
    }

    public static boolean isSymmetric(TreeNode root) {
        return isSymmetricChilds(root.left, root.right);
    }

    public static boolean isSymmetricChilds(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        return node1.val == node2.val &&
               isSymmetricChilds(node1.left, node2.right) &&
               isSymmetricChilds(node1.right, node2.left);
    }
}