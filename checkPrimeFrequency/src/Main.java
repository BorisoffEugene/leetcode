public class Main {
    public static void main(String[] args) {
        System.out.println(checkPrimeFrequency(new int[] {1,2,3,4,5,4}));
        System.out.println(checkPrimeFrequency(new int[] {1,2,3,4,5}));
        System.out.println(checkPrimeFrequency(new int[] {2,2,2,4,4}));
    }

    public static boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums)
            freq[num]++;

        for (int i = 0; i < 101; i++)
            if (checkPrime(freq[i])) return true;

        return false;
    }

    public static boolean checkPrime(int num) {
        return switch (num) {
            case 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 -> true;
            default ->  false;
        };
    }
}