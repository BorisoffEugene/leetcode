public class Main {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        int pos = s.indexOf(goal.charAt(0));

        while (pos != -1) {
            String s1 = s.substring(pos);
            String s2 = s.substring(0, pos);
            String s3 = s1 + s2;

            if (s3.equals(goal)) return true;

            pos = s.indexOf(goal.charAt(0), pos + 1);
        }

        return false;
    }
}