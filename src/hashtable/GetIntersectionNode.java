package hashtable;

import java.util.HashMap;

public class GetIntersectionNode {

      static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
        ListNode(){}
  }

    public static void main(String[] args) {
            ListNode ln1 = new ListNode(1);
            ListNode ln2 = new ListNode(9);
            ln1.next = ln2;
            ListNode ln3 = new ListNode(2);
            ln2.next = ln3;
            ListNode ln4 = new ListNode(4);
            ln3.next = ln4;
            ListNode lnB1 = new ListNode(3);
            lnB1.next = ln3;
            lnB1.next.next = ln4;

        var dummy = getIntersectionNode(ln1,lnB1);
        System.out.println(dummy.val + " : " + dummy );
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashMap<Integer, ListNode> hm = new HashMap<>();

        while(headA != null){
            if(!hm.containsKey(headA.val)){
                hm.put(headA.val,headA);
            }
            headA = headA.next;
        }

        while(headB != null){
            if(hm.containsKey(headB.val) && hm.get(headB.val).equals(headB)){
                return headB;
            }else
                headB = headB.next;
        }

        return null;
    }
}
