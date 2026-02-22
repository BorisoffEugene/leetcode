import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(countPrimes(5000000));
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(0));
        System.out.println(countPrimes(1));
        System.out.println(countPrimes(2));
    }

    public static int countPrimes(int n) {
        if (n < 2) return 0;

        // Создаем массив, инициализируя все значения как true (предположительно простые)
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        // 0 и 1 не являются простыми числами
        isPrime[0] = false;
        isPrime[1] = false;

        // Начинаем с 2, идем до корня из n
        for (int p = 2; p * p < n; p++)
            // Если p простое, то вычеркиваем его кратные
            if (isPrime[p])
                for (int i = p * p; i < n; i += p)
                    isPrime[i] = false;

        // Вывод простых чисел
        int res = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i]) res++;

        return res;
    }
}