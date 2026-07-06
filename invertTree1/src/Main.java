public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.fromArr(new Integer[] {4,2,7,1,3,6,9});
        System.out.println(invertTree(treeNode));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}