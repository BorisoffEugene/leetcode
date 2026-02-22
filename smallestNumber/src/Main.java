public class Main {
    public static void main(String[] args) {
        System.out.println(smallestNumber(5));
        System.out.println(smallestNumber(10));
        System.out.println(smallestNumber(3));
    }

    public static int smallestNumber(int n) {
         return (int)(Math.pow(2, Math.ceil(Math.log(n + 1) / Math.log(2))) - 1);
    }
}