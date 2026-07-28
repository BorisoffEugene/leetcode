import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(s2i("456"));
    }

    public static String multiply(String num1, String num2) {

        return "";
    }

    public static BigInteger s2i(String num) {
        char[] chars = num.toCharArray();
        BigInteger res = BigInteger.valueOf(0);
        for (char c : chars)
            res =  res.multiply(BigInteger.TEN).add(BigInteger.valueOf(c - '0'));

        return res;
    }
}