public class Main {
    public static void main(String[] args) {
        System.out.println(mapWordWeights(new String[] {"abcd","def","xyz"}, new int[] {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2}));
        System.out.println(mapWordWeights(new String[] {"a","b","c"}, new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
        System.out.println(mapWordWeights(new String[] {"abcd"}, new int[] {7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5}));
    }

    public static String mapWordWeights(String[] words, int[] weights) {
        int sum;
        char[] chars;
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sum = 0;
            chars = word.toCharArray();

            for (char c : chars)
                sum += weights[c - 'a'];

            sb.append((char)('z' - sum % 26));
        }

        return sb.toString();
    }
}