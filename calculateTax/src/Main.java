public class Main {
    public static void main(String[] args) {
        System.out.println(calculateTax(new int[][] {{3,50},{7,10},{12,25}}, 10));
        System.out.println(calculateTax(new int[][] {{1,0},{4,25},{5,50}}, 2));
        System.out.println(calculateTax(new int[][] {{2,50}}, 0));
    }

    public static double calculateTax(int[][] brackets, int income) {
        if (income == 0) return 0;

        double res = Math.min(brackets[0][0], income) * brackets[0][1] / 100.0;
        income -= brackets[0][0];

        int i = 1;
        int pay;
        while (income > 0) {
            pay = Math.min(brackets[i][0] - brackets[i - 1][0], income);
            res += pay * brackets[i][1] / 100.0;
            income -= pay;
            i++;
        }

        return res;
    }
}