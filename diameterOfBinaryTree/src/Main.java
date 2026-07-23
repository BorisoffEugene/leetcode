import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static Integer prev;
    private static int cnt;
    private static int max;
    private static List<Integer> list;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{1,null,2,2});
        System.out.println(Arrays.toString(findMode(root)));
    }

    public static int[] findMode(TreeNode root) {
        prev = null;
        cnt = 0;
        max = 0;
        list = new ArrayList<>();

        traverse(root);

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;
    }

    public static void traverse(TreeNode node) {
        if (node == null) return;

        traverse(node.left);

        if (prev != null && prev == node.val)
            cnt++;
        else
            cnt = 1;

        prev = node.val;

        if (cnt > max) {
            max = cnt;
            list.clear();
            list.add(node.val);
        } else if (cnt == max) {
            list.add(node.val);
        }

        traverse(node.right);
    }
}