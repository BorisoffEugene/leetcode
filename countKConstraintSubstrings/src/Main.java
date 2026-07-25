public class Main {
    public static void main(String[] args) {
        System.out.println(countKConstraintSubstrings("10101", 1));
        System.out.println(countKConstraintSubstrings("1010101", 2));
        System.out.println(countKConstraintSubstrings("11111", 1));
    }

    public static int countKConstraintSubstrings(String s, int k) {
        int cnt = 0;
        int left = 0;
        int cnt1 = 0;
        int cnt0 = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;

        for (int right = 0; right < len; right++) {
            if (chars[right] == '0')
                cnt0++;
            else
                cnt1++;

            while (cnt0 > k && cnt1 > k) {
                if (chars[left] == '0')
                    cnt0--;
                else
                    cnt1--;

                left++;
            }

            cnt += (right - left + 1);
        }

        return cnt;
    }
}