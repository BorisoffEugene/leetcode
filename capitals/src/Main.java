public class Main {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        return (
            word.equals(word.toUpperCase()) ||
            word.equals(word.toLowerCase()) ||
                    (
                            word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()) &&
                            word.substring(1).equals(word.substring(1).toLowerCase())
                    )
            );
    }
}