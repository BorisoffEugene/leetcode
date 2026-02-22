public class Main {
    public static void main(String[] args) {
        System.out.println(maxFreqSum("successes"));
        System.out.println(maxFreqSum("aeiaeia"));
    }

    public static int maxFreqSum(String s) {
        int[] arr = new int[26];
        int len = s.length();
        int maxV = 0;
        int maxC = 0;
        int j;

        for (int i = 0; i < len; i++) {
            j = s.charAt(i) - 97;
            arr[j]++;
            if (j == 0 || j == 4 || j == 8 || j ==14 || j == 20) {
                maxV = Math.max(maxV, arr[j]);
            } else {
                maxC = Math.max(maxC, arr[j]);
            }
        }

        return maxV + maxC;
    }
}