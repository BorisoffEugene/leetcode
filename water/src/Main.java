import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test = """
                4
                1 3
                3 1
                4 4
                7 1
                """;
        System.out.println(waterCnt(test));

        test = """
                3
                1 8
                10 11
                21 5
                """;
        System.out.println(waterCnt(test));

        test = """
                10
                2 1
                22 10
                26 17
                29 2
                45 20
                47 32
                72 12
                75 1
                81 31
                97 7
                """;
        System.out.println(waterCnt(test));
    }

    public static String waterCnt(String input) {
        Scanner scanner = new Scanner(input);
        int n = scanner.nextInt();

        int curWater = 0;
        int lastTime = 0;
        int curTime;
        int addWater;
        int minusWater;

        for (int i = 0; i < n; i++) {
            curTime = scanner.nextInt();
            addWater = scanner.nextInt();

            minusWater = curTime - lastTime;
            curWater = Math.max(curWater - minusWater, 0) + addWater;
            lastTime = curTime;
        }

        scanner.close();
        return String.valueOf(curWater);
    }
}