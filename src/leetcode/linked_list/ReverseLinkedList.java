package leetcode.linked_list;

public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

//        ListNode current = node1;
//        while (current != null){
//            System.out.println(current.val);
//            current = current.next;
//        }

        //Reversing the value
        ListNode newHead = reverseList(node1);
        ListNode current = newHead;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prevNode = null;
        ListNode current = head;

        while (current != null){

            ListNode nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;

        }
        return prevNode;
    }

}


