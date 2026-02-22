public class Main {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
    }

    public static boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) return false;

        int pos = sentence.indexOf(' ');
        while (pos != -1) {
            if (sentence.charAt(pos - 1) != sentence.charAt(pos + 1)) return false;
            pos = sentence.indexOf(' ', pos + 1);
        }

        return true;
    }
}