public class Main {
    public static void main(String[] args) {
        System.out.println(minDepth(new TreeNode(new Integer[]{3,9,20,null,null,15,7})));
        System.out.println(minDepth(new TreeNode(new Integer[]{2,null,3,null,4,null,5,null,6})));
    }

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left==null) return 1+(minDepth(root.right));
        if(root.right==null) return 1+minDepth(root.left);

        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}