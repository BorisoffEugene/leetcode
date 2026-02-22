import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxDepth(new TreeNode(new Integer[] {3,9,20,null,null,15,7})));
        System.out.println(maxDepth(new TreeNode(new Integer[] {1,null,2})));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        TreeNode tmp;
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 1;
        int res = 1;
        queue.add(root);

        while (!queue.isEmpty()) {
            tmp = queue.poll();
            res = tmp.val;

            if (tmp.left != null) {
                tmp.left.val = res + 1;
                queue.add(tmp.left);
            }

            if (tmp.right != null) {
                tmp.right.val = res + 1;
                queue.add(tmp.right);
            }
        }

        return res;
    }
}