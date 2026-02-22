public class Main {
    public static void main(String[] args) {
        System.out.println(reorderSpaces("  this   is  a sentence "));
        System.out.println(reorderSpaces(" practice   makes   perfect"));
    }

    public static String reorderSpaces(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder();
        String[] words = new String[len / 2 + 1];
        int cntWord = -1;
        int cntSpace = 0;

        for (char c : chars)
            if (c == ' ') {
                if (!sb.isEmpty()) {
                    words[++cntWord] = sb.toString();
                    sb.setLength(0);
                }
                cntSpace++;
            } else
                sb.append(c);

        if (!sb.isEmpty()) {
            words[++cntWord] = sb.toString();
            sb.setLength(0);
        }

        if (cntWord == 0)
            return words[0] + " ".repeat(cntSpace);

        int spaceBtwn = cntSpace / cntWord;
        int spaceEnd = cntSpace % cntWord;

        for (int i = 0; i < cntWord; i++) {
            sb.append(words[i]);
            sb.append(" ".repeat(spaceBtwn));
        }

        sb.append(words[cntWord]);
        sb.append(" ".repeat(spaceEnd));

        return sb.toString();
    }
}