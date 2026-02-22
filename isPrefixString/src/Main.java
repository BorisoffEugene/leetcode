public class Main {
    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        System.out.println(isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
        System.out.println(isPrefixString("fajsldfsa", new String[]{"faj","s","ldfs","afdfs","jfkdlsj","f"}));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        for (String word : words) {
            sb.append(word);
            if (sb.toString().length() > len) return false;
            if (s.equals(sb.toString())) return true;
        }

        return false;
    }
}