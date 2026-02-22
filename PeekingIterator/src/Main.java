import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();

        PeekingIterator peekingIterator = new PeekingIterator(iterator); // [ 1 ,2,3]
        System.out.println(peekingIterator.next()); // возвращает 1, указатель перемещается к следующему элементу [1, 2 ,3].
        System.out.println(peekingIterator.peek()); // возвращает 2, указатель не перемещается [1, 2 ,3].
        System.out.println(peekingIterator.next()); // возвращает 2, указатель перемещается к следующему элементу [1,2, 3 ]
        System.out.println(peekingIterator.next()); // Возвращаем 3, указатель перемещается к следующему элементу [1,2,3]
        System.out.println(peekingIterator.hasNext()); // Возвращаем False

    }
}