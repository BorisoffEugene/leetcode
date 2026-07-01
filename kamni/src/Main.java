import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();

            if ((input & 1) == 0)
                System.out.println("Anya");
            else
                System.out.println("Masha");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}