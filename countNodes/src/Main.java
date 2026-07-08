public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[] {1,2,3,4});
        System.out.println(countNodes(root));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int cnt = 0;
        int h = getLeftHeight(root);

        while (root != null) {
            if (getLeftHeight(root.right) == h - 1) {
                cnt += (1 << (h - 1));
                root = root.right;
            } else {
                cnt += (1 << (h - 2));
                root = root.left;
            }

            h--;
        }

        return cnt;
    }

    private static int getLeftHeight(TreeNode node) {
        int res = 0;
        while (node != null) {
            res++;
            node = node.left;
        }

        return res;
    }
}