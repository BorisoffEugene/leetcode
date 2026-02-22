public class Main {
    public static void main(String[] args) {
        /*System.out.println(findSpecialInteger(new int[] {1,2,2,6,6,6,6,7,10}));
        System.out.println(findSpecialInteger(new int[] {1,1}));*/
        System.out.println(findSpecialInteger(new int[] {1,1,2,2,3,3,3,3}));
    }

    public static int findSpecialInteger(int[] arr) {
        int cnt = 1;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == arr[i + 1]) {
                cnt++;
                if (4 * cnt > arr.length) return arr[i];
            }
            else
                cnt = 1;

        return arr[0];
    }
}