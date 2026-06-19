public class Main {
    public static void main(String[] args) {
        System.out.println(countSeniors(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
        System.out.println(countSeniors(new String[] {"1313579440F2036","2921522980M5644"}));
    }

    public static int countSeniors(String[] details) {
        int cnt = 0;

        for (String word : details)
            if (word.charAt(11) > '6')
                cnt++;
            else if (word.charAt(11) == '6' && word.charAt(12) > '0')
                cnt++;

        return cnt;
    }
}