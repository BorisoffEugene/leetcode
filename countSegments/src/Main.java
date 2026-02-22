public class Main {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments("Hello"));
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        String res = s.trim();
        if (res.length() == 0) return 0;

        return res.split("\\s+").length;
    }
}