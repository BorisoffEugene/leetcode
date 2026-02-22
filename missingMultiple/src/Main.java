public class Main {
    public static void main(String[] args) {
        System.out.println(missingMultiple(new int[] {8,2,3,4,6}, 2));
        System.out.println(missingMultiple(new int[] {1,4,7,10,15}, 5));
        System.out.println(missingMultiple(new int[] {42,13,99,13,71,32,64,32,63,44,6,22,8,2,55,88,43,40,71,80,95,32,46,19}, 44));
    }

    public static int missingMultiple(int[] nums, int k) {
        boolean[] check = new boolean[101];

        for (int num : nums) check[num] = true;

        int res = k;
        while (res < 101 && check[res]) res +=k;

        return res;
    }
}