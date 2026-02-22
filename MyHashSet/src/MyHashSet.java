import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    private List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (list.contains(key)) return;
        list.add(key);
    }

    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}