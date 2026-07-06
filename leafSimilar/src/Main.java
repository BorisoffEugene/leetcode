public class Main {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.fromArr(new Integer[] {1,2,3});
        TreeNode root2 = TreeNode.fromArr(new Integer[] {1,3,2});

        System.out.println(leafSimilar(root1, root2));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        getLeaf(root1, sb1);
        getLeaf(root2, sb2);

        return sb1.compareTo(sb2) == 0;
    }

    public static void getLeaf(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        if (root.left == null && root.right == null) {sb.append(root.val); sb.append(";");}

        getLeaf(root.left, sb);
        getLeaf(root.right, sb);
    }
}