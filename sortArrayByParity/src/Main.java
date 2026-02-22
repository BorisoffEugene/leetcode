import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[] {4,2,5,7})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[] {2,3})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];

        List<Integer> evenNumbers = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> oddNumbers = Arrays.stream(nums)
                .filter(n -> n % 2 != 0)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < res.length; i++)
            if (i % 2 == 0)
                res[i] = evenNumbers.removeLast();
            else
                res[i] = oddNumbers.removeLast();

        return res;
    }
}