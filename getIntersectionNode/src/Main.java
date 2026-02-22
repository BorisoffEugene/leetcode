import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode curNodeA = headA;
        ListNode curNodeB = headB;
        while (curNodeA != null || curNodeB != null) {
            if (curNodeA != null) {
                if (!set.add(curNodeA)) return curNodeA;
                curNodeA = curNodeA.next;
            }

            if (curNodeB != null) {
                if (!set.add(curNodeB)) return curNodeB;
                curNodeA = curNodeB.next;
            }
        }

        return null;
    }
}