public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        arrayToListNode(new int[]{-10,-10,-9,-4,1,6,6}, list1);
        System.out.println(nodeToString(list1));

        ListNode list2 = new ListNode();
        arrayToListNode(new int[]{-7}, list2);
        System.out.println(nodeToString(list2));

        ListNode resList = mergeTwoLists(list1, list2);
        System.out.println(nodeToString(resList));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode curNode1 = list1;
        if (list1.val < list2.val) {
            list2 = new ListNode(list1.val, list2);
            curNode1 = list1.next;
        }

        while (curNode1 != null) {
            ListNode curNode2 = list2;
            while (curNode2 != null) {
                if (checkNodeAfter(curNode2, curNode1)) {
                    insertNodeAfter(curNode2, curNode1);
                    break;
                }
                curNode2 = curNode2.next;
            }

            curNode1 = curNode1.next;
        }

        return list2;
    }

    public static boolean checkNodeAfter(ListNode srcNode, ListNode insNode) {
        if (insNode.val < srcNode.val) return false;

        if (srcNode.next == null) return true;

        return insNode.val < srcNode.next.val;
    }

    public static void insertNodeAfter(ListNode srcNode, ListNode insNode) {
        ListNode newNode = new ListNode(insNode.val, srcNode.next);
        srcNode.next = newNode;
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