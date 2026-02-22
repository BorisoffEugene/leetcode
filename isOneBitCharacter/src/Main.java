public class Main {
    public static void main(String[] args) {
        System.out.println(isOneBitCharacter(new int[] {1,0,0}));
        System.out.println(isOneBitCharacter(new int[] {1,1,1,0}));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) return true;

        int i = 0;
        while (true) {
            i = i + bits[i] + 1;
            if (i == bits.length - 1) return true;
            if (i > bits.length - 1) return false;
        }
    }
}