public class Main {
    public static void main(String[] args) {
        ListNode nodeHead = new ListNode(new int[] {4,5,1,9});
        System.out.println(nodeHead);

        deleteNode(nodeHead.next.next);
        System.out.println(nodeHead);
    }

    public static void deleteNode(ListNode node) {
        ListNode curNode = node;

        while (true) {
            curNode.val = curNode.next.val;

            if (curNode.next.next == null) {
                curNode.next = null;
                return;
            }
            curNode = curNode.next;
        }
    }

}