import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[] {5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[] {5,5,10,10,20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int[] arr = {0, 0};

        for (int bill : bills)
            switch (bill) {
                case 5 -> {
                    arr[0]++;
                }
                case 10 -> {
                    if (arr[0] == 0) return false;
                    arr[0]--;
                    arr[1]++;
                }
                case 20 -> {
                    if (arr[1] > 0 && arr[0] > 0) {
                        arr[1]--;
                        arr[0]--;
                    } else if (arr[1] == 0 && arr[0] > 2) {
                        arr[0] -= 3;
                    } else {
                        return false;
                    }
                }
            }

        return true;
    }
}