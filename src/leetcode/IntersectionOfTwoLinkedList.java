package leetcode;

public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {
        ListNode c3 = new ListNode(3,null);
        ListNode c2 = new ListNode(2,c3);
        ListNode c1 = new ListNode(1,c2);


        ListNode a2 = new ListNode(5,c1);
        ListNode a1 = new ListNode(4,a2);

        ListNode b3 = new ListNode(6,c1);
        ListNode b2 = new ListNode(7,b3);
        ListNode b1 = new ListNode(8,b2);

        ListNode result = getIntersectionNode(a1, b1);
        System.out.println(result.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB){
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }

}
