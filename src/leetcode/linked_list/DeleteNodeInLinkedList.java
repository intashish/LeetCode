package leetcode.linked_list;

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5,null);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        deleteNode(node3);
        while (node1 != null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }

    public static void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
