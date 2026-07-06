public class Main {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.fromArr(new Integer[] {1,3,2,5});
        TreeNode root2 = TreeNode.fromArr(new Integer[] {2,1,3,null,4,null,7});

        System.out.println(mergeTrees(root1, root2));
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;

        TreeNode node = new TreeNode(0);
        if (root1 != null) node.val += root1.val;
        if (root2 != null) node.val += root2.val;

        node.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        node.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);

        return node;
    }
}