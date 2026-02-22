public class Main {
    public static void main(String[] args) {
        System.out.println(countValidWords("he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."));
        System.out.println(countValidWords("cat and  dog"));
        System.out.println(countValidWords("!this  1-s b8d!"));
        System.out.println(countValidWords("alice and  bob are playing stone-game10"));
        System.out.println(countValidWords(" o6 t"));
    }

    public static int countValidWords(String sentence) {
        char[] chars = sentence.toCharArray();

        int i = 0;
        boolean isWord = true;
        boolean isHyp = false;
        boolean isMark = false;
        int res = 0;

        while (i < chars.length && chars[i] == ' ') i++;

        while (i < chars.length) {
            // пробел - конец слова - если не попали не в один плохой вариант - ++ - и идем до след слова
            if (chars[i] == ' ') {
                if (isWord) res++;

                do {
                    i++;
                } while (i < chars.length && chars[i] == ' ');
                if (i == chars.length) return res;
                isWord = true;
                isHyp = false;
                isMark = false;
            // цифры - не будет слова - бежим до след пробела или конца
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                isWord = false;

                do {
                    i++;
                } while (i < chars.length && chars[i] != ' ');
            // черточка - если в начале или в конце - не будет слова - бежим до след пробела или конца
            } else if (chars[i] == '-') {
                if (isHyp || i == 0 || chars[i - 1] == ' ' || i == chars.length - 1 || chars[i + 1] == ' ') {
                    isWord = false;

                    do {
                        i++;
                    } while (i < chars.length && chars[i] != ' ');
                } else
                    i++;
                isHyp = true;
            // !., - если не в конце -  не будет слова - бежим до след пробела или конца
            } else if (chars[i] == '!' || chars[i] == '.' || chars[i] == ',') {
                if ((i == 0 || chars[i - 1] == ' ') && (i == chars.length - 1 || chars[i + 1] == ' ')) {
                    i++;
                } else if (!isMark && (i > 0 && chars[i - 1] >= 'a') && (i == chars.length - 1 || chars[i + 1] == ' ')) {
                    i++;
                } else {
                    isWord = false;

                    do {
                        i++;
                    } while (i < chars.length && chars[i] != ' ');
                }
                isMark = true;
            } else
                i++;
        }

        if (isWord) res++;

        return res;
    }
}