public class Main {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int k = arr.length - 1;
        boolean iIsLetter;
        boolean kIsLetter;
        char c;

        while (true) {
            if (k <= i) break;

            iIsLetter = Character.isLetter(arr[i]);
            kIsLetter = Character.isLetter(arr[k]);

            if (iIsLetter) {
                if (kIsLetter) {
                    c = arr[i];
                    arr[i] = arr[k];
                    arr[k] = c;
                } else {
                    i--;
                }
            } else if (kIsLetter) {
                k++;
            }

            i++; k--;
        }

        return String.valueOf(arr);
    }
}