public class Main {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[] {"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[] {"++X","++X","X++"}));
        System.out.println(finalValueAfterOperations(new String[] {"X++","++X","--X","X--"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (String op : operations)
            if (op.charAt(1) == '-') res--; else res++;

        return res;
    }
}