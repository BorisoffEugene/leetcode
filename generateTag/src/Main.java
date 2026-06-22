public class Main {
    public static void main(String[] args) {
        System.out.println(generateTag("Leetcode daily streak achieved"));
    }

    public static String generateTag(String caption) {
        char[] chars = caption.trim().toCharArray();
        if (chars.length == 0) return "#";

        StringBuilder sb = new StringBuilder("#");
        sb.append(Character.toLowerCase(chars[0]));
        boolean isSpace = false;


        for (int i = 1; i < chars.length; i++)
            if (chars[i] == ' ')
                isSpace = true;
            else if (isSpace) {
                sb.append(Character.toUpperCase(chars[i]));
                isSpace = false;
            } else
                sb.append(Character.toLowerCase(chars[i]));

        return sb.substring(0, Math.min(sb.length(), 100));
    }
}