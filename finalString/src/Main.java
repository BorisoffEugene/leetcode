public class Main {
    public static void main(String[] args) {
        System.out.println(finalString("string"));
        System.out.println(finalString("poiinter"));
    }

    public static String finalString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars)
            if (c == 'i')
                sb.reverse();
            else
                sb.append(c);

        return sb.toString();
    }
}