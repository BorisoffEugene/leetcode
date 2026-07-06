import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

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

    public static TreeNode fromArr(Integer[] arr) {
        if (arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length) {
                if (arr[i] != null) {
                    current.left = new TreeNode(arr[i]);
                    queue.add(current.left);
                }
                i++;
            }

            if (i < arr.length) {
                if (arr[i] != null) {
                    current.right = new TreeNode(arr[i]);
                    queue.add(current.right);
                }
                i++;
            }
        }

        return root;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current != null) {
                sj.add(String.valueOf(current.val));
                queue.add(current.left);
                queue.add(current.right);
            } else {
                sj.add("null");
            }
        }

        String result = sj.toString();
        return result.replaceAll("(, null)+\\]$", "]");
    }
}