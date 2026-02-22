public class Main {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        System.out.println(myHashMap);
        myHashMap.put(1, 1);
        System.out.println(myHashMap);
        myHashMap.put(2, 2);
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(3));
        myHashMap.put(2, 1);
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(2));
    }
}