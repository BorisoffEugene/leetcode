public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {1,0,1,0,1,0,1});
        System.out.println(sumRootToLeaf(root));
    }

    public static int sumRootToLeaf(TreeNode root) {
        return calc(root, 0);
    }

    public static int calc(TreeNode node, int sum) {
        if (node == null) return 0;

        sum = (sum << 1) | node.val;
        if (node.left == null && node.right == null) return sum;

        return calc(node.left, sum) + calc(node.right, sum);
    }
}