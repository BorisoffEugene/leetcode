public class Main {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        String str = "";

        while (head != null) {
            str += head.val;
            head = head.next;
        }

        return str.equals(new StringBuilder(str).reverse().toString());
    }
}