import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(Integer[] arr) {
        this.val = arr[0];
        TreeNode tmp;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        for (int i = 1; i < arr.length; i++) {
            tmp = queue.poll();
            if (arr[i] != null) {
                tmp.left = new TreeNode(arr[i]);
                queue.add(tmp.left);
            }
            i++;
            if (arr[i] != null) {
                tmp.right = new TreeNode(arr[i]);
                queue.add(tmp.right);
            }
            if (queue.isEmpty()) break;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[");
        TreeNode tmp;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            tmp = queue.poll();
            res.append(res.length() == 1 ? "" : ",").append(tmp.val);

            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.add(tmp.right);
        }

        res.append("]");
        return res.toString();
    }
}

