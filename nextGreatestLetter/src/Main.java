import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'}, 'a'));
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[] {'x','x','y','y'}, 'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for (char c = (char)(target + 1); c <= 'z'; c++)
            if (Arrays.binarySearch(letters, c) >= 0) return c;

        return letters[0];
    }
}