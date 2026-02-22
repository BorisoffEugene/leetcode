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
        arrayToListNode(new int[]{1,2,6,3,4,5,6}, list);
        System.out.println(nodeToString(list));

        ListNode newList = removeElements(list, 6);
        System.out.println(nodeToString(newList));
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode curNode = head;
        ListNode newHead = null;
        ListNode newCurNode = null;

        while (curNode != null) {
            if (val != curNode.val) {
                if (newHead == null) {
                    newCurNode = new ListNode(curNode.val);
                    newHead = newCurNode;
                } else {
                    newCurNode.next = new ListNode(curNode.val);
                    newCurNode = newCurNode.next;
                }
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