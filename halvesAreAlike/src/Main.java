public class Main {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int cnt = 0;

        for (int i = 0; i < half; i++) {
            if (isVowel(s.charAt(i))) {
                cnt++;
            }
            if (isVowel(s.charAt(i + half))) {
                cnt--;
            }
            if (Math.abs(cnt) > half - i - 1) return false;
        }

        return cnt == 0;
    }

    public static boolean isVowel(char c){
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}