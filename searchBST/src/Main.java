public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{4,2,7,1,3});
        System.out.println(searchBST(root, 2));
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        TreeNode node = searchBST(root.left, val);
        if (node != null) return node;

        node = searchBST(root.right, val);
        return node;
    }
}