import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[] {5,3,6,1,12}, 3));
        System.out.println(findFinalValue(new int[] {2,7,9}, 4));
    }

    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while(set.contains(original))
            original *= 2;

        return original;
    }
}