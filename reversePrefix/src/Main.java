public class Main {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    }

    public static String reversePrefix(String word, char ch) {
        int pos = word.indexOf(ch) + 1;

        if (pos == 0)
            return word;
        else
            return new StringBuilder(word.substring(0, pos)).
                    reverse().
                    append(word.substring(pos)).
                    toString();
    }
}