public class Main {
    public static void main(String[] args) {
        System.out.println(countLargestGroup(13));
        System.out.println(countLargestGroup(2));
    }

    public static int countLargestGroup(int n) {
        int len = getLen(n);
        
        int[] freq = new int[len];

        for (int i = 1; i <= n; i++) 
            freq[digSum(i)]++;

        int max = freq[1];
        for (int i = 2; i < len; i++)
            if (max < freq[i]) max = freq[i];

        int res = 0;
        for (int i = 1; i < len; i++)
            if (freq[i] == max) res++;
            
        return res;    
    }

    public static int digSum(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
    
    public static int getLen(int n) {
        if (n < 10) return 10;
        if (n < 100) return 19;
        if (n < 1_000) return 28;
        return 37;
    }
}