package leetcode.linked_list.practise_v2;

import leetcode.linked_list.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(3,null);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        ListNode result = reverseList(node1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}
