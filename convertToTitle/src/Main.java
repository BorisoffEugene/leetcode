public class Main {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(2));
        System.out.println(convertToTitle(3));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        int num = columnNumber;
        String res = "";

        while (num > 0){
            res = (char) ('A' + (num - 1) % 26) + res;
            num = (num - 1) / 26;
        }

        return res;
    }
}