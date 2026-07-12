public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations("01010"));
    }

    public static int minOperations(String s) {
        char[] chars = s.toCharArray();
        char check = '0';
        int cnt = 0;

        for (char c: chars) {
            if (check != c) cnt++;
            check = check == '0' ? '1' : '0';
        }

        if (cnt == 0) return 0;

        int min = cnt;
        check = '1';
        cnt = 0;

        for (char c: chars) {
            if (check != c) {cnt++; if (cnt == min) return min;}
            check = check == '0' ? '1' : '0';
        }

        return cnt;
    }
}