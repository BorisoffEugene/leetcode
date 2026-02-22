import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[] {0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[] {4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[] {29,47,21,41,13,37,25,7}));
    }

    public static int mostFrequentEven(int[] nums) {
        int res = -1;
        int freq = 0;
        int curFreq;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (num % 2 == 1) continue;

            curFreq = map.getOrDefault(num, 0) + 1;
            map.put(num, curFreq);

            if (curFreq > freq) {
                freq = curFreq;
                res = num;
            } else if (curFreq == freq && num < res) {
                res = num;
            }
        }

        return res;
    }
}