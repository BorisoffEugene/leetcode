import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPeaks(new int[] {2,4,4}));
        System.out.println(findPeaks(new int[] {1,4,3,8,5}));

    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++)
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1])
                res.add(i++);         

        return res;
    }
}