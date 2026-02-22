public class Main {
    public static void main(String[] args) {

        System.out.println(bitwiseComplement(5));
        System.out.println(bitwiseComplement(7));
        System.out.println(bitwiseComplement(10));
    }

    public static int bitwiseComplement(int n) {
        return Integer.parseInt(Integer.toBinaryString(n).replace('0', '2').replace('1', '0').replace('2', '1'), 2);
    }
}