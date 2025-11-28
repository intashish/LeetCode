package leetcode.linked_list;

public class MiddleNodeInLinkedList {
    public static void main(String[] args) {

//        ListNode node6 = new ListNode(6,null);
        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        ListNode result = middleNode(node1);

        System.out.println(result.val);
    }
    public static ListNode middleNode(ListNode head) {

        if(head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
