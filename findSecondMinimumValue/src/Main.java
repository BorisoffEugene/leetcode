public class Main {
    public static int min1;
    public static int min2;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {2,2,2147483647});
        System.out.println(findSecondMinimumValue(root));
    }

    public static int findSecondMinimumValue(TreeNode root) {
        min1 = -1;
        min2 = -1;

        find(root);

        return min2;
    }

    public static void find(TreeNode node) {
        if (node == null) return;

        if (node.val == min1) {
        } else if (min1 == -1 || node.val < min1) {
            min2 = min1;
            min1 = node.val;
        } else if (min2 == -1 || node.val < min2)
            min2 = node.val;

        find(node.left);
        find(node.right);
    }

}