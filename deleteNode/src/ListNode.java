public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    ListNode(int[] arr) {
        this.val = arr[0];
        ListNode tmp = this;
        for (int i = 1; i < arr.length; i++) {
            tmp.next = new ListNode(arr[i]);
            tmp = tmp.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.val);
        ListNode tmp = this.next;

        while (tmp != null) {
            sb.append(",");
            sb.append(tmp.val);
            tmp = tmp.next;
        }

        sb.append("]");

        return sb.toString();
    }
}