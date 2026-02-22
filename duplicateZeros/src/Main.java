import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        duplicateZeros(new int[] {1,0,2,3,0,4,5,0});
        duplicateZeros(new int[] {1,2,3});
        System.out.println("255.100.50.0".replaceAll("\\.", "[.]"));
    }

    public static void duplicateZeros(int[] arr) {
        int[] copy = arr.clone();
        int i = 0;
        int len = copy.length;

        for (int elm : copy) {
            arr[i++] = elm;
            if (i == len) break;
            if (elm == 0) {arr[i++] = 0; if (i == len) break;}
        }

        System.out.println(Arrays.toString(arr));
    }
}