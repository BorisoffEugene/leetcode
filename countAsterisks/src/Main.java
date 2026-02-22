public class Main {
    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks("iamprogrammer"));
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    public static int countAsterisks(String s) {
        char[] chars = s.toCharArray();
        int res = 0;

        for (int i = 0; i < chars.length; i++)
            if (chars[i] == '|')
                do {
                    i++;
                } while (chars[i] != '|');
            else if (chars[i] == '*')
                res++;

        return res;
    }
}