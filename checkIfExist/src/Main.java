import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {10,2,5,3}));
        System.out.println(checkIfExist(new int[] {10,2,4,5,3}));
        System.out.println(checkIfExist(new int[] {3,1,7,11}));
        System.out.println(checkIfExist(new int[] {0,3,1,7,11,0}));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int elm : arr) {
            if (elm % 2 == 0 && set.contains(elm / 2)) return true;
            if (set.contains(elm * 2)) return true;
            set.add(elm);
        }

        return false;
    }
}