public class Main {
    private static int res;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{4,2,9,3,5,null,7});
        System.out.println(findTilt(root));
    }

    public static int findTilt(TreeNode root) {
        res = 0;
        calc(root);
        return res;
    }

    public static int calc(TreeNode node) {
        if (node == null) return 0;

        int left = calc(node.left);
        int right = calc(node.right);

        res += Math.abs(left - right);

        return node.val + left + right;
    }

}