public class Main {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[] {"5","2","C","D","+"}));
        System.out.println(calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
        System.out.println(calPoints(new String[] {"1","C"}));
    }

    public static int calPoints(String[] operations) {
        int[] res = new int[operations.length];
        int ptr = -1;
        int sum = 0;

        for (String op : operations)
            switch (op) {
                case "C" -> ptr--;
                case "D" -> res[++ptr] = 2 * res[ptr - 1];
                case "+" -> res[++ptr] = res[ptr - 1] + res[ptr - 2];
                default ->  res[++ptr] = Integer.parseInt(op);
            }

        for (int i = 0; i <= ptr; i++)
            sum += res[i];

        return sum;
    }
}