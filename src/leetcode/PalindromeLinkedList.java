package leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {

//        ListNode node4 = new ListNode(1,null);
        ListNode node3 = new ListNode(2,null);
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

        
    }
}
