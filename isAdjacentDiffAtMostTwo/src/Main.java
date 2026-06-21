public class Main {
    public static void main(String[] args) {
        System.out.println(isAdjacentDiffAtMostTwo("132"));
        System.out.println(isAdjacentDiffAtMostTwo("129"));
    }

    public static boolean isAdjacentDiffAtMostTwo(String s) {
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i++)
            if (Math.abs(chars[i - 1] - chars[i]) > 2) return false;

        return true;
    }
}