import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++)
            generateRow(list, i);

        return list;
    }

    public static void generateRow(List<List<Integer>> list, int n) {
        if (n == 0) {
            addVal(list, 0, n, 1);
            return;
        }

        if (n == 1) {
            addVal(list, 0, n, 1);
            addVal(list, 1, n, 1);
            return;
        }

        addVal(list, 0, n, 1);
        for (int k = 1; k < n; k++)
            addVal(list, k, n, getVal(list, k - 1, n - 1) + getVal(list, k, n - 1));
        addVal(list, n, n, 1);
    }

    public static Integer getVal(List<List<Integer>> list, int k, int n) {
        return list.get(n).get(k);
    }

    public static void addVal(List<List<Integer>> list, int k, int n, Integer val) {
        if (k == 0) list.add(new ArrayList<>());
        list.get(n).add(val);
    }
}