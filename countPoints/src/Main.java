public class Main {
    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
        System.out.println(countPoints("B0R0G0R9R0B0G0"));
        System.out.println(countPoints("G4"));
    }

    public static int countPoints(String rings) {
        boolean[][] rod = new boolean[10][3];

        char[] chars = rings.toCharArray();
        for (int i = 0; i < chars.length - 1; i+=2)
            rod[chars[i + 1] - '0'][switch (chars[i]) {case 'R' -> 0; case 'G' -> 1; default -> 2;}] = true;

        int res = 0;
        for (int i = 0; i < 10; i++)
            if (rod[i][0] && rod[i][1] && rod[i][2]) res++;

        return res;
    }
}