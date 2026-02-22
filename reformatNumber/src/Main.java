public class Main {
    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
    }

    public static String reformatNumber(String number) {
        String tmp = number.replaceAll("\\D+", "");
        String res = "";
        String part;

        while (true) {
            switch (tmp.length()) {
                case 0 -> {return res;}
                case 2, 3 -> {part = tmp.substring(0); tmp = "";}
                case 4 -> {part = tmp.substring(0, 2) + "-" + tmp.substring(2); tmp = "";}
                default -> {part = tmp.substring(0, 3); tmp = tmp.substring(3);}
            }

            res += res == "" ? part : "-" + part;
        }
    }
}