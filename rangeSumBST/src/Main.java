public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{10,5,15,3,7,null,18});
        System.out.println(rangeSumBST(root, 7, 15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int val = 0;
        if (root.val >= low && root.val <= high) val = root.val;

        return val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}