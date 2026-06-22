public class Main {
    public static void main(String[] args) {
        System.out.println(maxA("1109", "91"));
    }

    public static String maxA(String A, String B) {
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();

        int[] freq = new int[10];
        for (char c : charB)
            freq[c - '0']++;

        int digA;
        for (int i = 0; i < charA.length; i++) {
            digA = charA[i] - '0';
            for (int digB = 9; digB > digA; digB--)
                if (freq[digB] > 0) {
                    charA[i] = (char) (digB + '0');
                    freq[digB]--;
                    break;
                }
        }

        return new String(charA);
    }
}