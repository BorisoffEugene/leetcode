public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode list = new ListNode();
        arrayToListNode(new int[]{1,2}, list);
        System.out.println(nodeToString(list));
        System.out.println(nodeToString(reverseList(list)));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode curNode = head;
        ListNode rootNode = null;

        while (curNode != null) {
            rootNode = new ListNode(curNode.val, rootNode);
            curNode = curNode.next;
        }

        return rootNode;
    }

    public static String nodeToString(ListNode node) {
        String res = "[";
        ListNode curNode = node;

        while (curNode != null) {
            if (!res.equals("[")) res += ",";
            res += curNode.val;

            curNode = curNode.next;
        }

        return res + "]";
    }

    public static void arrayToListNode(int[] array, ListNode rootNode) {
        if (array.length == 0) {rootNode = null; return;}

        rootNode.val = array[0];
        ListNode curNode = rootNode;

        for (int i = 1; i < array.length; i++) {
            ListNode nextNode = new ListNode(array[i]);
            curNode.next = nextNode;
            curNode = nextNode;
        }
    }
}