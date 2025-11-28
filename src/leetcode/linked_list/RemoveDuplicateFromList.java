package leetcode.linked_list;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {

        ListNode node3 = new ListNode(2,null);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        ListNode head = deleteDuplicates(node1);

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        ListNode next = current.next;
        while (current != null && next != null){
            if(current.val == next.val){
                next = next.next;
                continue;
            }
            current.next = next;
            current = next;
            next = next.next;
        }
        return head;
    }
}
