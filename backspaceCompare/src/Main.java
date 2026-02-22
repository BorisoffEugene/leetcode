public class Main {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d##"));
        System.out.println(backspaceCompare( "a#c", "b"));
    }

    public static boolean backspaceCompare(String s, String t) {
        return changeWord(s).equals(changeWord(t));
    }

    public static String changeWord(String word) {
        String res = "";
        char[] chars = word.toCharArray();

        for (char elm : chars)
            if (elm == '#') {
                int len = res.length();
                if (len > 0) res = res.substring(0, len - 1);
            }
            else
                res += elm;

        return res;
    }
}