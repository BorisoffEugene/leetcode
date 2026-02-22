public class Main {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        System.out.println(mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 1;

        for (String sentence : sentences)
            max = Math.max(max, countWords(sentence));

        return max;
    }

    public static int countWords(String sentence) {
        int res = 1;

        for (char c : sentence.toCharArray())
            if (c == ' ') res++;

        return res;
    }
}