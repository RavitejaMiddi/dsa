package linkedList;


     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MergeTwoLists {
    public static void main(String[] args) {



    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode newList = null;

        while(list1 != null || list2 != null){
            if(list2 == null && list1 != null){
                ListNode n = new ListNode(list1.val);
                if(newList == null) {
                    newList = n;
                    head = newList;
                }else{
                    newList.next = n;
                    newList = newList.next;
                }
                list1 = list1.next;
                continue;
            }else if(list1 == null && list2 != null){
                ListNode n = new ListNode(list2.val);
                if(newList == null) {
                    newList = n;
                    head = newList;
                }else{
                    newList.next = n;
                    newList = newList.next;
                }
                list2 = list2.next;
                continue;
            }
            else if(list1.val >= list2.val){
                ListNode n = new ListNode(list2.val);
                if(newList == null) {
                    newList = n;
                    head = newList;
                }
                else {
                    newList.next = n;
                    newList = newList.next;
                }
                list2 = list2.next;
            }else{
                ListNode n = new ListNode(list1.val);
                if(newList == null) {
                    newList = n;
                    head = newList;
                }
                else {
                    newList.next = n;
                    newList = newList.next;
                }
                list1 = list1.next;
            }

        }
        return head;
    }
}
