package leetcode;

public class BinaryToDecimalIinkedList {
    public static void main(String[] args) {

        ListNode node3 = new ListNode(1,null);
        ListNode node2 = new ListNode(0,node3);
        ListNode node1 = new ListNode(1,node2);

        int result = getDecimalValue(node1);
        System.out.println(result);
    }
    public static int getDecimalValue(ListNode head) {

        int temp = 0;
        ListNode current = head;
//        StringBuilder binary = new StringBuilder();
        while (current != null){
//            binary.append(current.val);
            temp = (temp << 1) | current.val;
            current = current.next;
        }
//        return Integer.parseInt(binary.toString(), 2);
        return  temp;
    }
}
