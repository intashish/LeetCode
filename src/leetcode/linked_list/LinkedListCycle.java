package leetcode.linked_list;

public class LinkedListCycle {
    public static void main(String[] args) {

        ListNode node4 = new ListNode(4,null);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        node4.next = node2;
        boolean result = hasCycle(node1);
        System.out.println(result);
    }
    public static boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return  true;
        }
        return  false;
    }

}
