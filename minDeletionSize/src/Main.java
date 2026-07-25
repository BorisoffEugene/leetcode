public class Main {
    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"cba","daf","ghi"}));
        System.out.println(minDeletionSize(new String[]{"a","b"}));
        System.out.println(minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    public static int minDeletionSize(String[] strs) {
        int len = strs[0].length();
        int cnt = 0;

        for (int i = 0; i < len; i++)
            for (int j = 1; j < strs.length; j++)
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    cnt++;
                    break;
                }

        return cnt;
    }
}