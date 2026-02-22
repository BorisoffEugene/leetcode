public class Main {
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(1, new int[]{-2});
        System.out.println(kthLargest);
        System.out.println(kthLargest.add(-3));
        System.out.println(kthLargest);
        System.out.println(kthLargest.add(0));
        System.out.println(kthLargest);
        System.out.println(kthLargest.add(2));
        System.out.println(kthLargest);
        System.out.println(kthLargest.add(-1));
        System.out.println(kthLargest);
        System.out.println(kthLargest.add(4));
        System.out.println(kthLargest);
    }
}