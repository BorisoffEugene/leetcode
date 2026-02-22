import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    Deque<Integer> deque;

    public MyQueue() {
        deque = new ArrayDeque<>();
    }

    public void push(int x) {
        deque.addLast(x);
    }

    public int pop() {
        return deque.pop();
    }

    public int peek() {
        return deque.peek();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}