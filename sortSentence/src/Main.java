public class Main {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }

    public static String sortSentence(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[10];

        for (char c : chars)
            if (c == ' ')
                continue;
            else if (c < 58) {
                arr[c - '0'] = sb.toString();
                sb.setLength(0);
            } else
                sb.append(c);

        sb.setLength(0);
        sb.append(arr[1]);
        for (int i = 2; i < 10; i++) {
            if (arr[i] == null) break;
            sb.append(" ");
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}