public class Main {
    public static void main(String[] args) {
        System.out.println(average(new int[] {4000,3000,1000,2000}));
        System.out.println(average(new int[] {1000,2000,3000}));
    }

    public static double average(int[] salary) {
        int sum = salary[0];
        int max = sum;
        int min = sum;

        for (int i = 1; i < salary.length; i++) {
            sum += salary[i];
            if (salary[i] > max) max = salary[i];
            else if (salary[i] < min) min = salary[i];
        }

        return (sum - max - min) * 1.0 / (salary.length - 2);
    }
}