public class Main {
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(capitalizeTitle("i lOve leetcode"));
    }

    public static String capitalizeTitle(String title) {
        char[] chars = title.toCharArray();

        for (int i = 0; i < chars.length; i++)
            // Первая буква
            if (i == 0 || chars[i - 1] == ' ') {
                // большая и слово не больше 2 букв
                if (chars[i] >= 'A' && chars[i] <= 'Z' && (i > chars.length - 3 || chars[i + 1] == ' ' || chars[i + 2] == ' '))
                    chars[i] += 32;
                // маленькая и слово больше 2 букв
                else if (chars[i] >= 'a' && chars[i] <= 'z' && i <= chars.length - 3 && chars[i + 1] != ' ' && chars[i + 2] != ' ')
                    chars[i] -= 32;
            // другая буква
            } else if (chars[i] >= 'A' && chars[i] <= 'Z')
                chars[i] += 32;

        return new String(chars);
    }
}