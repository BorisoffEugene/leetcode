import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[] {1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[] {1,1,2,3}));
        System.out.println(distributeCandies(new int[] {6,6,6,6}));
        System.out.println(distributeCandies(new int[] {5, 5}));
        System.out.println(distributeCandies(new int[] {5, 1}));
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = Arrays.stream(candyType)
                .boxed()
                .collect(Collectors.toSet());

        return Math.min(set.size(), candyType.length / 2);
    }
}