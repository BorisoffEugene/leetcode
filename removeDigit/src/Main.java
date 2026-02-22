public class Main {
    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3'));
        System.out.println(removeDigit("1231", '1'));
        System.out.println(removeDigit("551", '5'));
        System.out.println(removeDigit("15454", '4'));
    }

    public static String removeDigit(String number, char digit) {
        char[] chars = number.toCharArray();
        int len = chars.length - 1;

        for (int i = 0; i < len; i++)
            if (number.charAt(i) == digit && number.charAt(i + 1) > number.charAt(i))
                return number.substring(0, i) + number.substring(i + 1);

        int pos = number.lastIndexOf(digit);
        return number.substring(0, pos) + number.substring(pos + 1);
    }
}