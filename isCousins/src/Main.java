public class Main {
    private static int parentX;
    private static int parentY;
    private static int depthX;
    private static int depthY;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{1,2,3,null,4,null,5});
        System.out.println(isCousins(root, 5, 4));
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        parentX = 0;
        depthX = 0;
        parentY = 0;
        depthY = 0;
        find(root, -1, -1, x, y);

        return depthX == depthY && parentX != parentY;
    }

    public static void find(TreeNode node, int parent, int depth, int x, int y) {
        if (node == null) return;

        if (node.val == x) {
            parentX = parent;
            depthX = depth + 1;
        } else if (node.val == y) {
            parentY = parent;
            depthY = depth + 1;
        }

        if (parentX != 0 && parentY != 0) return;

        find(node.left, node.val, depth + 1, x, y);
        find(node.right, node.val, depth + 1, x, y);
    }
}