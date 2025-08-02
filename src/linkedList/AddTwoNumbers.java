package linkedList;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {

    public static void main(String[] args) {
        System.out.println();
    }

    public static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        var totalSum = sumOfList(l1) + sumOfList(l2);
        return  reversedList(totalSum);
    }



    public static int sumOfList(ListNode1 listNode){
        StringBuilder sb = new StringBuilder();
        while(listNode!= null){
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        return Integer.parseInt(String.valueOf(sb.reverse()));
    }
    //function to convert sum of two list value into desired list(Output)
    public static ListNode1 reversedList(int totalSum){
        ListNode1 listNode = new ListNode1();
        ListNode1 head= listNode;
        while(totalSum != 0){
            int rem = totalSum % 10;
            listNode.val = rem;
            totalSum = totalSum / 10;
            if(totalSum != 0){
                ListNode1 newList = new ListNode1();
                listNode.next = newList;
            }
            listNode = listNode.next;
        }


        return head;
    }
}
