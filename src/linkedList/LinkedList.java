package linkedList;

public class LinkedList {
        Node head;
        private static int count=0;

     static class Node{
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public LinkedList insert(LinkedList list,int data){
         Node new_node = new Node(data);
         count = count +  1;
         if(list.head==null)
            list.head = new_node;
         else {
             //  traverse till the last node
             // and insert the new_node there
             Node last = list.head;
             while(last.next != null){
                 last = last.next;
             }
             last.next = new_node;
         }
         return list;
    }

    public void printList(LinkedList list){
         if(list.head == null){
             System.out.println("List is Empty");
         }else {
             var current = list.head;
             while (current != null){
                 System.out.print(current.data + " ");
                 current = current.next;
             }
         }
    }
    //deleting
    public void delete(LinkedList list,int ele){
         if(list.head == null)
             System.out.println("List is Empty");
         else{
             var current = list.head;
             var previous = current;
             while(current.data != ele){
                 previous = current;
                 current = current.next;
             }
             previous.next = current.next;
         }
    }
    public boolean search(LinkedList list,int ele){
         if(list.head == null)
             System.out.println("List is Empty");
         else{
             var current = list.head;
             while(current != null){
                 if(current.data==ele)
                     return true;
                 current = current.next;
             }
         }
         return false;
    }

    public int length(LinkedList list){
         return count;
    }

}
