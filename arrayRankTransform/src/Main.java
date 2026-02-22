import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[] {40,10,20,30})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[] {100,100,100})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[] {37,12,28,9,100,56,80,5,12})));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int[] arrCopy = Arrays.copyOf(arr, len);
        Arrays.sort(arrCopy);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int elm : arrCopy)
            if (!map.containsKey(elm))
                map.put(elm, rank++);

        for (int i = 0; i < len; i++)
            arr[i] = map.get(arr[i]);

        return arr;
    }
}