import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class KthLargest {
    private List<Integer> list;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());
    }

    public int add(int val) {
        if (list.isEmpty()) {list.add(Integer.valueOf(val)); return val;}
        if (list.size() <= 2) {
            list.add(Integer.valueOf(val));
            list.sort(Comparator.reverseOrder());
            return list.get(k - 1);
        }

        int start = 0;
        int end = list.size() - 1;
        int idx = start + (end - start) / 2;

        while (true) {
            int idxVal = list.get(idx);
            if (val > idxVal)
                end = idx;
            else if (val < idxVal)
                start = idx;
            else
                break;

            if (end - start == 1) {
                idx = (val < list.get(start)) ? end : start;
                break;
            }

            idx = start + (end - start) / 2;
        }

        list.add(idx, val);
        return list.get(k - 1);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
