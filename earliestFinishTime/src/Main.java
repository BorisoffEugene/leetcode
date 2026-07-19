public class Main {
    public static void main(String[] args) {
        System.out.println(earliestFinishTime(
                new int[] {2,8},
                new int[] {4,1},
                new int[] {6},
                new int[] {3}
        ));
    }

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int endL = landStartTime[0] + landDuration[0];
        for (int i = 1; i < landStartTime.length; i++)
            endL = Math.min(endL, landStartTime[i] + landDuration[i]);

        int endW = waterStartTime[0] + waterDuration[0];
        for (int i = 1; i < waterStartTime.length; i++)
            endW = Math.min(endW, waterStartTime[i] + waterDuration[i]);

        int res = Math.max(endL, waterStartTime[0]) + waterDuration[0];
        for (int i = 1; i < waterStartTime.length; i++)
            res = Math.min(res, Math.max(endL, waterStartTime[i]) + waterDuration[i]);

        for (int i = 0; i < landStartTime.length; i++)
            res = Math.min(res, Math.max(endW, landStartTime[i]) + landDuration[i]);

        return res;
    }
}