public class Main {
    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[] {-10,-3,0,5,9}));
        System.out.println(sortedArrayToBST(new int[] {1,3}));
        System.out.println(sortedArrayToBST(new int[] {1}));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return getRoot(nums, 0, nums.length - 1);
    }

    public static TreeNode getRoot(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = getRoot(nums, left, mid - 1);
        root.right = getRoot(nums, mid + 1, right);

        return root;
    }
}