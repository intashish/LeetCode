package leetcode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        //first sorted LL
        ListNode node3 = new ListNode(6,null);
        ListNode node2 = new ListNode(2,node3);
        ListNode l1 = new ListNode(1,node2);

        //second sorted LL
        ListNode node6 = new ListNode(5,null);
        ListNode node5 = new ListNode(4,node6);
        ListNode m1 = new ListNode(1,node5);
        ListNode current = mergeTwoLists(l1, m1);

        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode m1) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null && m1 != null){
            if(l1.val <= m1.val){
                current.next = l1;
                l1 = l1.next;

            } else {
                current.next = m1;
                m1 = m1.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : m1;
        return head.next;
    }
}
