package twopointer;

import javax.swing.tree.TreeNode;
import java.util.List;

//Definition for singly-linked list.
 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthFromEnd {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;

        while (curr!= null){
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
       curr = head;
        ListNode prev = curr;
        for(int i=1;i<=(size-n);i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return head;
    }
}
