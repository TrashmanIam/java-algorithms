package linkedList;

public class LinkedListCycleDetection {
    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String [] args){

        ListNode four = new ListNode(4, null);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

        System.out.println(hasCycle(head));

    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
