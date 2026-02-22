import java.util.HashSet;
import java.util.Set;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        arrayToListNode(new int[]{3,2,0,-4}, list);
        System.out.println(nodeToString(list));
        System.out.println(hasCycle(list));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;

        HashSet<ListNode> set = new HashSet<>();
        ListNode curNode = head;

        while(curNode != null) {
            if (!set.add(curNode)) return true;
            curNode = curNode.next;
        }

        return false;
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