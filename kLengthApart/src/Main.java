public class Main {
    public static void main(String[] args) {
        System.out.println(kLengthApart(new int[] {1,0,0,0,1,0,0,1}, 2));
        System.out.println(kLengthApart(new int[] {1,0,0,1,0,1}, 2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int startPos = -1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1) {
                startPos = i;
                break;
            }
        if (startPos == -1) return true;

        int lastPos = startPos;

        for (int i = startPos + 1; i < nums.length; i++)
            if (nums[i] == 1) {
                if (i - lastPos - 1 < k)
                    return false;
                else
                    lastPos = i;
            }

        return true;
    }
}