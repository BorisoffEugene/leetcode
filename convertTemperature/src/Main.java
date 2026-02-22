import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.5)));
        System.out.println(Arrays.toString(convertTemperature(122.11)));
    }

    public static double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.8 + 32};
    }
}