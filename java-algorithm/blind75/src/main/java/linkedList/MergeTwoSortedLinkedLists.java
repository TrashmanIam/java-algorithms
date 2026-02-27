package linkedList;

public class MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null){
            node.next = list1;
        } else {
            node.next = list2;
        }

        return dummy.next;
    }

    public static void main(String [] args) {

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(5);

        ListNode mergedListNode = mergeTwoLists(listNode1, listNode2);

        while (mergedListNode != null) {
            System.out.print(mergedListNode.val);
            if (mergedListNode.next != null) {
                System.out.print(" -> ");
            }
            mergedListNode = mergedListNode.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
   }
}
