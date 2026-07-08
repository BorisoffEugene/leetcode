import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<long[]> list;

    public static void main(String[] args) {
        TreeNode root = TreeNode.fromArr(new Integer[]{5,2,-3});
        System.out.println(averageOfLevels(root));
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        list = new ArrayList<>();

        fillList(root, 0);

        List<Double> res = new ArrayList<>();
        for (var elm : list)
            res.add(1.0 * elm[0] / elm[1]);

        return res;
    }

    public static void fillList(TreeNode node, int level) {
        if (node == null) return;

        if (list.size() <= level)
            list.add(new long[2]);

        long[] arr = list.get(level);
        arr[0] += node.val;
        arr[1]++;

        fillList(node.left, level + 1);
        fillList(node.right, level + 1);
    }
}