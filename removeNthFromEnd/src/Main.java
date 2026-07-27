import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        //head.next = new ListNode(2);
        removeNthFromEnd(head, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        List<ListNode> nodes = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            nodes.add(node);
            node = node.next;
        }

        int idx = nodes.size() - n;
        if (idx == 0) return nodes.get(idx).next;
        nodes.get(idx - 1).next = nodes.get(idx).next;
        return head;
    }
}