public class Main {
    public static void main(String[] args) {
        System.out.println(generateKey(1, 10, 1000));
        System.out.println(generateKey(987, 879, 798));
        System.out.println(generateKey(1, 2, 3));
    }

    public static int generateKey(int num1, int num2, int num3) {
        return
                Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10)) +
                Math.min((num1 / 10) % 10, Math.min((num2 / 10) % 10, (num3 / 10) % 10)) * 10 +
                Math.min((num1 / 100) % 10, Math.min((num2 / 100) % 10, (num3 / 100) % 10)) * 100 +
                Math.min(num1 / 1000, Math.min(num2 / 1000, num3 / 1000)) * 1000;
    }
}