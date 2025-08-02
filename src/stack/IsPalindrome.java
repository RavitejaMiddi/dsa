package stack;

import java.util.Stack;


public class IsPalindrome {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

        ListNode ls1= new ListNode();
        ls1.val = 1;
        ListNode ls2 = new ListNode();
        ls1.next = ls2;
        ls2.val = 2;
        ListNode ls3 = new ListNode();
        ls2.next = ls3;
        ls3.val = 2;
        ListNode ls4 = new ListNode();
        ls3.next = ls4;
        ls4.val = 2;
        ListNode ls5 = new ListNode();
        ls4.next = ls5;
        ls5.val = 2;
        ListNode ls6 = new ListNode();
        ls5.next = ls6;
        ls6.val = 1;

        System.out.println(isPalindrome(ls1));
    }
    public static boolean isPalindrome(ListNode head) {
        Stack stack = new Stack();
        ListNode dummy = head;
        //push all elements to stack
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }

        while (dummy != null){
            if((int)stack.peek() == dummy.val) {
                stack.pop();
                dummy = dummy.next;
            }
            else {
               return false;
            }
        }
        return true;
    }




}
