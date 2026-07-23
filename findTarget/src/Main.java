public class Main {
    private static boolean[] check;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{5,3,6,2,4,null,7});
        System.out.println(findTarget(root, 9));
    }

    public static boolean findTarget(TreeNode root, int k) {
        check = new boolean[202_002];
        return checkNode(root, k);
    }

    public static boolean checkNode(TreeNode node, int k) {
        if (node == null) return false;

        if (check[k - node.val + 10_000]) return true;

        check[node.val + 10_000] = true;

        return checkNode(node.left, k) || checkNode(node.right, k);
    }
}