public class Main {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
        System.out.println(replaceDigits("a1b2c3d4e"));
    }

    public static String replaceDigits(String s) {
        int len = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        char c;

        for (int i = 0; i < len; i += 2) {
            c = s.charAt(i);
            sb.append(c);
            sb.append((char)(c + s.charAt(i + 1) - 48));
        }

        if ((len & 1) == 0) sb.append(s.charAt(len));

        return sb.toString();
    }
}