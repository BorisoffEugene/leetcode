public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
        System.out.println(isValid("b3"));
        System.out.println(isValid("a3$e"));
    }

    public static boolean isValid(String word) {
        if (word.length() < 3) return false;

        char[] chars = word.toLowerCase().toCharArray();
        boolean isDig = false;
        boolean isVow = false;
        boolean isCon = false;

        for (char c : chars) {
            if ("@#$".indexOf(c) >= 0) return false;
            if (!isDig) if ("0123456789".indexOf(c) >= 0) isDig = true;
            if (!isVow) if ("aeiou".indexOf(c) >= 0) isVow = true;
            if (!isCon) if ("bcdfghjklmnpqrstvwxyz".indexOf(c) >= 0) isCon = true;
        }

        return isDig && isVow && isCon;
    }
}