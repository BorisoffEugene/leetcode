public class Main {
    public static void main(String[] args) {
        System.out.println(smallestAbsent(new int[] {3,5}));
        System.out.println(smallestAbsent(new int[] {-1,1,2}));
        System.out.println(smallestAbsent(new int[] {4,-1}));
        System.out.println(smallestAbsent(new int[] {98,100}));
        System.out.println(smallestAbsent(new int[] {1,-39,9}));
    }

    public static int smallestAbsent(int[] nums) {
        boolean[] check = new boolean[202];
        int sum = 0;

        for (int num :nums) {
            sum += num;
            check[num + 100] = true;
        }

        sum = Math.max(sum / nums.length + 101, 101);

        for (int i = sum; i < 202; i++)
            if (!check[i]) return i - 100;

        return -1;
    }
}