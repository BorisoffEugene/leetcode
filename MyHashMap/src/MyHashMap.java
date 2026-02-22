import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    private List<Integer> keyList;
    private List<Integer> valList;

    public MyHashMap() {
        keyList = new ArrayList<>();
        valList = new ArrayList<>();
    }

    public void put(int key, int value) {
        int idx = getIndex(key);
        if (idx == -1) {
            keyList.add(Integer.valueOf(key));
            valList.add(Integer.valueOf(value));
        } else
            valList.set(idx, Integer.valueOf(value));
    }

    public int get(int key) {
        return getValByKey(key);
    }

    public void remove(int key) {
        removeValByKey(key);
        keyList.remove(Integer.valueOf(key));
    }

    private int getIndex(int key) {
        return keyList.indexOf(key);
    }

    private int getValByKey(int key) {
        int idx = getIndex(key);
        if (idx == -1) return -1;

        return valList.get(idx);
    }

    private void removeValByKey(int key) {
        int idx = getIndex(key);
        if (idx == -1) return;

        valList.remove(idx);
    }

    @Override
    public String toString() {
        String str = "[";

        for (int key : keyList) {
            if (!str.equals("[")) str += ",";
            str += "[" + key + "," + getValByKey(key) + "]";
        }

        return str + "]";
    }
}