public class Main {
    public static void main(String[] args) {
        System.out.println(findLatestTime("1?:?4"));
        System.out.println(findLatestTime("09:5?"));
        System.out.println(findLatestTime("??:??"));
    }

    public static String findLatestTime(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();

        if (chars[0] == '0') {
            res.append('0');
            if (chars[1] == '?')
                res.append('9');
            else
                res.append(chars[1]);
        } else if (chars[0] == '1') {
            res.append('1');
            if (chars[1] == '?')
                res.append('1');
            else
                res.append(chars[1]);
        } else {
            if (chars[1] == '?' || chars[1] <= '1') {
                res.append('1');
                if (chars[1] == '?')
                    res.append('1');
                else
                    res.append(chars[1]);
            } else {
                res.append('0');
                res.append(chars[1]);
            }
        }

        res.append(':');

        if (chars[3] == '?')
            res.append('5');
        else
            res.append(chars[3]);

        if (chars[4] == '?')
            res.append('9');
        else
            res.append(chars[4]);

        return res.toString();
    }
}