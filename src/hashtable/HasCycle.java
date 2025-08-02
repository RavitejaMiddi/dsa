package hashtable;


import java.util.HashSet;
 class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
               }
 }
public class HasCycle {

    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        while(head.next != null){
            if(!set.contains(head)){
                set.add(head);
                head = head.next;
            }else
                return true;
        }
        return false;
    }
}
