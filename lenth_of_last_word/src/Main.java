public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord(" fgr "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        int pos = s.lastIndexOf(" ");

        if (pos == -1) return len;

        return len - pos - 1;
    }
}