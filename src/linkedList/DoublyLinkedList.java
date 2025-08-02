package linkedList;

public class DoublyLinkedList {

    Node head;
    private static int count=0;

    static class Node{
        int data;

        Node prev;

        Node next;

        public Node(int data){
            this.data = data;
            prev = next = null;
        }
    }

    public DoublyLinkedList insert(int data, DoublyLinkedList list){
        Node new_node = new Node(data);
        if(head == null) {
            head = new_node;
            count++;
        }
        else{
            var current = head;
            while(current.next != null){
                current = current.next;
            }
            new_node.prev = current;
            current.next = new_node;
            count++;
        }
        return list;
    }

    public void printList(DoublyLinkedList list){
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
    public int length(DoublyLinkedList list){
        return count;
    }

    public void delete(int data, DoublyLinkedList list){



    }

}
