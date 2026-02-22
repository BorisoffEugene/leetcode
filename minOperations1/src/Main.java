public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[] {"d1/","d2/","../","d21/","./"}));
        System.out.println(minOperations(new String[] {"d1/","d2/","./","d3/","../","d31/"}));
        System.out.println(minOperations(new String[] {"d1/","../","../","../"}));
    }

    public static int minOperations(String[] logs) {
        int res = 0;

        for(String str : logs)
            if (str.equals("./"))
                continue;
            else if (str.equals("../"))
                res = Math.max(0, res - 1);
            else
                res++;

        return res;
    }
}