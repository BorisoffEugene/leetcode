import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("a1b01c001"));
        System.out.println(numDifferentIntegers("0a0"));
        System.out.println(numDifferentIntegers("167278959591294"));
    }

    public static int numDifferentIntegers(String word) {
        int len = word.length();
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        char c;

        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c >= 48 && c <= 57) {
                sb.setLength(0);
                while (c == 48) {
                    i++;
                    if (i >= len) break;
                    c = word.charAt(i);
                }
                while (c <= 57) {
                    sb.append(c);
                    i++;
                    if (i >= len) break;
                    c = word.charAt(i);
                }

                if (sb.length() == 0)
                    set.add("0");
                else
                    set.add(sb.toString());
            }
        }

        return set.size();
    }
}