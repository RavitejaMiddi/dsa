package linkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list = list.insert(list,1);
//        list = list.insert(list,2);
//        list = list.insert(list,3);
//        list = list.insert(list,5);
//        list = list.insert(list,0);
//        new LinkedList().printList(list);
//        System.out.println();
//        new LinkedList().delete(list,3);
//        new LinkedList().printList(list);
//        System.out.println();
//        System.out.println(new LinkedList().search(list,10));
//        System.out.println(new LinkedList().length(list));


        System.out.println("Doubly Linked List..");

        DoublyLinkedList dl = new DoublyLinkedList();

        dl =  dl.insert(1,dl);
        dl =  dl.insert(3,dl);
        dl =  dl.insert(4,dl);
        dl =  dl.insert(6,dl);
        dl =  dl.insert(8,dl);
        new DoublyLinkedList().printList(dl);
        System.out.println();
        System.out.println("Length : " + new DoublyLinkedList().length(dl));



    }
}
