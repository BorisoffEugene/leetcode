public class Main {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }

    public static int findComplement(int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
        String res = "";

        for (char elm : arr)
            res += (elm == '1') ? "0" : "1";

        return Integer.parseInt(res, 2);
    }
}