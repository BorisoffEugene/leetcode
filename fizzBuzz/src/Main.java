import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {res.add("FizzBuzz"); continue;}
            if (i % 3 == 0) {res.add("Fizz"); continue;}
            if (i % 5 == 0) {res.add("Buzz"); continue;}

            res.add(Integer.toString(i));
        }

        return res;
    }
}