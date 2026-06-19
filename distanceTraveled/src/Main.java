public class Main {
    public static void main(String[] args) {
        System.out.println(distanceTraveled(5, 10));
        System.out.println(distanceTraveled(1, 2));
    }

    public static int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;

        for (int i = 1; i <= additionalTank; i++) {
            if (mainTank < 5) break;
            mainTank = mainTank - 5 + 1;
            res +=50;
        }

        res = res + mainTank * 10;
        return res;
    }
}