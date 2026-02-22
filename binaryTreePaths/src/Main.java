import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left.left == null && root.left.right == null) return root.val;

        return sumOfLeftLeaves(root.left)
    }


}