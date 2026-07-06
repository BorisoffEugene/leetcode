public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[] {1,1,1}));
        System.out.println(numberOfAlternatingGroups(new int[] {0,1,0,0,1}));
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int len = colors.length;
        int res = 0;

        if (colors[0] != colors[len - 1] && colors[0] != colors[1]) res++;
        if (colors[len - 1] != colors[len - 2] && colors[len - 1] != colors[0]) res++;

        for (int i = 1; i < len - 1; i++)
            if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) res++;

        return res;
    }
}