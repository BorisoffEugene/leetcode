import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<String> letterCombinations(String digits) {
        char[][] chars = {
                {'a', 'c'},
                {'d', 'f'},
                {'g', 'i'},
                {'j', 'l'},
                {'m', 'o'},
                {'p', 's'},
                {'t', 'v'},
                {'w', 'z'}
        };
        char[] digs = digits.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char dig : digs) {
            
            for (char c = chars[dig - '2'][0]; c <= chars[dig - '2'][1]; c++)
                sb.append(c);
        }

    }
}