public class Main {
    public static void main(String[] args) {
        System.out.println(countKeyChanges("aAbBcC"));
        System.out.println(countKeyChanges("AaAaAaaA"));
    }

    public static int countKeyChanges(String s) {
        char[] chars = s.toCharArray();
        int tmp;
        int res = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            tmp = Math.abs(chars[i + 1] - chars[i]);
            if (tmp != 0 && tmp != 32) res++;
        }

        return res;
    }
}