public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
        System.out.println(checkIfPangram("jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo"));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] exists = new boolean[26];
        char[] chars = sentence.toCharArray();
        int idx;
        int cnt = 0;

        for (char c : chars) {
            idx = c - 'a';
            if (!exists[idx]) {
                exists[idx] = true;
                cnt++;
                if (cnt == 26) return true;
            }
        }

        return false;
    }
}