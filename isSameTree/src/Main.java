public class Main {
    public static void main(String[] args) {
        System.out.println(isSameTree(new TreeNode(new Integer[] {1,2,3}), new TreeNode(new Integer[] {1,2,3})));
        System.out.println(isSameTree(new TreeNode(new Integer[] {1,2}), new TreeNode(new Integer[] {1,null,2})));
        System.out.println(isSameTree(new TreeNode(new Integer[] {1,2,1}), new TreeNode(new Integer[] {1,1,2})));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        return false;
    }
}