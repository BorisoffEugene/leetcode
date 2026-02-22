import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    private Deque<Integer> deque;

    public MyStack() {
        deque = new ArrayDeque<>();
    }

    public void push(int x) {
        deque.addFirst(x);
    }

    public int pop() {
        return deque.pop();
    }

    public int top() {
        return deque.peek();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}
