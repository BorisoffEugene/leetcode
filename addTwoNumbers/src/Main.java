public class Main {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(new int[] {2,4,3}), new ListNode(new int[] {5,6,4})));
        System.out.println(addTwoNumbers(new ListNode(new int[] {0}), new ListNode(new int[] {0})));
        System.out.println(addTwoNumbers(new ListNode(new int[] {9,9,9,9,9,9,9}), new ListNode(new int[] {9,9,9,9})));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode tmp = res;
        int nextVal = 0;
        int curVal;
        while (true) {
            if (l1 != null) {
                curVal = l1.val;
                l1 = l1.next;
            }
            else {
                curVal = 0;
            }
            if (l2 != null) {
                curVal += l2.val;
                l2 = l2.next;
            }
            curVal += nextVal;

            tmp.val = curVal % 10;
            nextVal = curVal / 10;

            if (l1 == null && l2 == null && nextVal == 0) break;

            tmp.next = new ListNode();
            tmp = tmp.next;
        }

        return res;
    }
}