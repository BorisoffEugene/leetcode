public class Main {
    public static void main(String[] args) {
        System.out.println(countStudents(new int[] {1,1,0,0}, new int[] {0,1,0,1}));
        System.out.println(countStudents(new int[] {1,1,1,0,0,1}, new int[] {1,0,0,0,1,1}));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];

        for (int std : students)
            cnt[std]++;

        for (int snd : sandwiches) {
            if (cnt[snd] == 0) break;
            cnt[snd]--;
        }

        return cnt[0] + cnt[1];
    }
}