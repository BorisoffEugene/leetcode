public class Main {
    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"}));
        System.out.println(maximumNumberOfStringPairs(new String[] {"ab","ba","cc"}));
        System.out.println(maximumNumberOfStringPairs(new String[] {"aa","ab"}));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int res = 0;

        for (int i = 0; i < words.length - 1; i++)
            for (int j = i + 1; j < words.length; j++)
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    res++;
                    break;
                }

        return res;
    }
}