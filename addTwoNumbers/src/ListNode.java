public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] arr) {
        ListNode tmp = this;
        tmp.val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp.next = new ListNode(arr[i]);
            tmp = tmp.next;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(val);

        ListNode tmp = next;
        while (tmp != null) {
            sb.append(",").append(tmp.val);
            tmp = tmp.next;
        }

        sb.append("]");
        return sb.toString();
    }
}