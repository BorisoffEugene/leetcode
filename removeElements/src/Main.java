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
        arrayToListNode(new int[]{1,1,2,3,3}, list);
        System.out.println(nodeToString(list));

        ListNode newList = deleteDuplicates(list);
        System.out.println(nodeToString(newList));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        int curVal = head.val;
        ListNode curNode = head.next;
        ListNode newHead = new ListNode(head.val);
        ListNode newCurNode = newHead;

        while (curNode != null) {
            if (curVal != curNode.val) {
                curVal = curNode.val;
                newCurNode.next = new ListNode(curVal);
                newCurNode = newCurNode.next;
            }
            curNode = curNode.next;
        }

        return newHead;
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