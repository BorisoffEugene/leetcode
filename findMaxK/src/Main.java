import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxK(new int[] {-1,2,-3,3}));
        System.out.println(findMaxK(new int[] {-1,10,6,7,-7,1}));
        System.out.println(findMaxK(new int[] {-10,8,6,7,-2,-3}));
    }

    public static int findMaxK(int[] nums) {
        int res = -1;
        int absNum;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            absNum = Math.abs(num);
            if (set.contains(-num) && res < absNum) res = absNum;
        }

        return res;
    }
}