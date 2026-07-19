public class Main {
    public static void main(String[] args) {
        System.out.println(countBalls(1, 10));
        System.out.println(countBalls(5, 15));
        System.out.println(countBalls(19, 28));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int[] boxes = new int[46];

        int tmp = lowLimit;
        int d1 = tmp % 10; tmp /=10;
        int d2 = tmp % 10; tmp /=10;
        int d3 = tmp % 10; tmp /=10;
        int d4 = tmp % 10; tmp /=10;
        int d5 = tmp % 10;

        int sum = d1 + d2 + d3+ d4+ d5;
        boxes[sum]++;
        int max = 1;

        for (int i = lowLimit + 1; i <= highLimit; i++) {
            d1++;
            sum++;

            if (d1 == 10) {
                d1 = 0;
                d2++;
                sum -= 9;

                if (d2 == 10) {
                    d2 = 0;
                    d3++;
                    sum -= 9;

                    if (d3 == 10) {
                        d3 = 0;
                        d4++;
                        sum -= 9;

                        if (d4 == 10) {
                            d4 = 0;
                            d5++;
                            sum -= 9;
                        }
                    }
                }
            }

            boxes[sum]++;
            max = Math.max(max, boxes[sum]);
        }

        return max;
    }
}