public class Main {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));
    }

    public static String largestGoodInteger(String num) {
        String[] goods = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};

        for (String g : goods)
            if (num.contains(g)) return g;

        return "";
    }
}