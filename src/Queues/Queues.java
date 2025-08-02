package Queues;

public class Queues {
    private int[] array = new int[10];
    private  int front ;
    private int back ;
    private int curr = 0;

    public Queues(){
        front = 0;
        back = -1;
    }

    public void enqueue(int ele){
        if(back <= array.length) {
            array[++back] = ele;
            curr++;
        }
        else
            System.out.println("Queue is Full");
    }

    public int dequeue(){
        return array[front++];
    }

    public int peek(){
        return array[front];
    }
    public int size(){
        return curr;
    }


    public static void main(String[] args) {

        Queues queues = new Queues();
        queues.enqueue(10);
        queues.enqueue(20);
        queues.enqueue(30);
        queues.enqueue(40);
//        System.out.println("top ele " + queues.peek());
//        System.out.println("remove top " + queues.dequeue());
//        System.out.println("top ele" + queues.peek());
//        System.out.println("remove top" + queues.dequeue());
//        System.out.println(" remove top" + queues.dequeue());
//        System.out.println("top ele " + queues.peek());
//        System.out.println("rem ele " + queues.dequeue());
//        System.out.println("top ele " + queues.peek());
        System.out.println(queues.size());

    }


}
