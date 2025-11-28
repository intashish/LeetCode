package leetcode.linked_list.practise_v2;

import leetcode.linked_list.ListNode;

public class MergedTwoSortedLists {
    public static void main(String[] args) {
        ListNode b3 = new ListNode(6,null);
        ListNode b2 = new ListNode(4,b3);
        ListNode b1 = new ListNode(1,b2);

        ListNode a3 = new ListNode(5,null);
        ListNode a2 = new ListNode(2,a3);
        ListNode a1 = new ListNode(1,a2);

        ListNode result = mergeTwoLists(a1,b1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : l2;
        return head.next;
    }
}
