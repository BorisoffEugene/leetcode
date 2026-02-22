public class Main {
    public static void main(String[] args) {
        System.out.println(vowelStrings(new String[] {"are","amy","u"}, 0, 2));
        System.out.println(vowelStrings(new String[] {"hey","aeo","mu","ooo","artro"}, 1, 4));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int len;
        int res = 0;

        for (int i = left; i <= right; i++) {
            len = words[i].length() - 1;
            if (
                    (words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' ||
                    words[i].charAt(0) == 'i' || words[i].charAt(0) == 'o' ||
                    words[i].charAt(0) == 'u') &&
                    (words[i].charAt(len) == 'a' || words[i].charAt(len) == 'e' ||
                    words[i].charAt(len) == 'i' || words[i].charAt(len) == 'o' ||
                    words[i].charAt(len) == 'u')
            ) res++;
        }

        return res;
    }
}