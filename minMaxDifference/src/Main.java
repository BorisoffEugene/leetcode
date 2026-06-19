public class Main {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
        System.out.println(minMaxDifference(90));
    }

    public static int minMaxDifference(int num) {
        String s = String.valueOf(num);

        int max = num;
        int min = Integer.parseInt(s.replace(s.charAt(0), '0'));

        int len = s.length();
        for (int i = 0; i < len; i++)
            if (s.charAt(i) != '9') {
                max = Integer.parseInt(s.replace(s.charAt(i), '9'));
                break;
            }

        return max - min;
    }
}