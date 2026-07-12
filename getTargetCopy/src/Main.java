public class Main {
    public static void main(String[] args) {
        TreeNode original = TreeNode.fromArr(new Integer[]{7,4,3,null,null,6,19});
        TreeNode cloned = TreeNode.fromArr(new Integer[]{7,4,3,null,null,6,19});
        TreeNode target = new TreeNode(3);
        System.out.println(getTargetCopy(original, cloned, target));
    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return find(cloned, target.val);
    }

    public static TreeNode find(final TreeNode node, int val) {
        if (node == null) return null;
        if (node.val == val) return node;

        TreeNode tmp = find(node.left, val);
        if (tmp != null) return tmp;
        return find(node.right, val);
    }
}