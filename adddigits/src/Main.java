public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }

    public static int addDigits(int num) {
        if (num <= 9) return num;

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return addDigits(sum);
    }
}