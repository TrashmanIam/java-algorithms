package linkedList;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if (head == null) return new ListNode();
        if (head.next == null) return head;

        ListNode curr = head, prev = null, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static void main(String [] args){

        ListNode tree = new ListNode(3);
        ListNode two = new ListNode(2, tree);
        ListNode one = new ListNode(1, two);
        ListNode head = new ListNode(0, one);


        ListNode reverseListNode = reverseList(head);
        while (reverseListNode != null) {
            System.out.print(reverseListNode.val);
            if (reverseListNode.next != null) {
                System.out.print(" -> ");
            }
            reverseListNode = reverseListNode.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}