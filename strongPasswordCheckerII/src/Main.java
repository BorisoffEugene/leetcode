public class Main {
    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
        System.out.println(strongPasswordCheckerII("Me+You--IsMyDream"));
        System.out.println(strongPasswordCheckerII("1aB!"));
    }

    public static boolean strongPasswordCheckerII(String password) {
        int len = password.length() - 1;
        if (len < 7) return false;

        char c;
        boolean noLC = true;
        boolean noUC = true;
        boolean noD = true;
        boolean noS = true;

        for (int i = 0; i <= len; i++) {
            c = password.charAt(i);
            if (i != len && c == password.charAt(i + 1)) return false;

            if (noLC && c >= 'a' && c <= 'z') noLC = false;
            if (noUC && c >= 'A' && c <= 'Z') noUC = false;
            if (noD && c >= '0' && c <= '9') noD = false;
            if (noS && (c >= '!' && c <= '-' || c == '^' || c == '@')) noS = false;
        }

        return !(noLC || noUC || noD || noS);
    }
}