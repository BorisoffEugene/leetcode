import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    private int n;
    private String[] arr;
    private int ptr = 1;

    public OrderedStream(int n) {
        this.n = n;
        arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> res = new ArrayList<>();

        if (ptr != idKey) return res;

        while (ptr < arr.length && arr[ptr] != null) {
            res.add(arr[ptr]);
            ptr++;
        }

        return res;
    }
}