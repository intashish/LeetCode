package leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        ListNode node4 = new ListNode(1,null);
        ListNode node3 = new ListNode(2,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        boolean result = isPalindrome(node1);
        System.out.println(result);
    }

    public static boolean isPalindrome(ListNode head) {

        //O(n) time and o(n) space
//        Stack<Integer> stack = new Stack<>();
//        ListNode currentNode = head;
//
//        while (currentNode != null){
//            stack.push(currentNode.val);
//            currentNode = currentNode.next;
//        }
//
//        currentNode = head;
//        while (currentNode != null){
//            if(currentNode.val != stack.pop())
//                return false;
//            currentNode =currentNode.next;
//        }
//
//        return true;

        //Reverse the second half and compare for palindrome
        //Using fast and slow
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reverseHead = reverseListNode(slow);

        ListNode start = head;
        ListNode end = reverseHead;
        while(end != null){ //using end because end will always be smaller.
            if(start.val != end.val){
                return false;
            }
            start = start.next;
            end = end.next;
        }
        return true;
    }

    public static ListNode reverseListNode(ListNode node){

        ListNode pre = null;
        ListNode cur = node;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return  pre;
    }
}
