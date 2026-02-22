public class Main {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        int res = 0;

        for (char ch : chars)
            res += stones.chars()
                    .filter(c -> c == ch)
                    .count();

        return res;
    }
}