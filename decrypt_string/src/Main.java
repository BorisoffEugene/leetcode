public class Main {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }

    public static String freqAlphabets(String s) {
        String res = new String(s);

        for(int i = 10; i <= 26; i++)
            res = res.replaceAll(i + "#", "" + (char)(96 + i));

        for(int i = 1; i <= 9; i++)
            res = res.replaceAll("" + i, "" + (char)(96 + i));

        return res;
    }
}