package leetcode.linked_list;

public class RemoveLinkedListElements {
    public static void main(String[] args) {

        ListNode node6 = new ListNode(6,null);
        ListNode node5 = new ListNode(2,node6);
        ListNode node4 = new ListNode(1,node5);
        ListNode node3 = new ListNode(6,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        int val = 6;

        ListNode current = removeElements(node1, val);
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

       ListNode dummy = new ListNode(0);
       dummy.next = head;

       ListNode pre = dummy;
       ListNode current = head;
       while (current != null){
           if(current.val == val){
               pre.next = current.next;
           }else{
               pre = current;
           }
           current = current.next;
       }
       return  dummy.next;
    }
}
