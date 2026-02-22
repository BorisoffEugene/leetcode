import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[]{}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : banned)
            map.put(word, Integer.MIN_VALUE);

        String[] arr = paragraph.toLowerCase().split("[\\p{P}\\s]+");
        int maxVal = 0;
        int val;
        String res = "";
        for(String word : arr) {
            val = map.getOrDefault(word, 0) + 1;
            if (val > maxVal) {
                maxVal = val;
                res = word;
            }
            map.put(word, val);
        }

        return res;
    }
}