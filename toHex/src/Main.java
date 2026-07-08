public class Main {
    public static void main(String[] args) {
        System.out.println(toHex(26));
        System.out.println(toHex(-1));
    }

    public static String toHex(int num) {
        if (num == 0) return "0";

        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] res = new char[8];
        int i = 7;

        while (num != 0) {
            res[i--] = map[num & 15];
            num >>>= 4;
        }

        return new String(res, i + 1, 7 - i);
    }
}