package Queues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CountStudents {
    public static void main(String[] args) {

    }
    public int countStudents(int[] students, int[] sandwiches) {
        Queue studentsQueue = new PriorityQueue();
        Stack sandwichesStack = new Stack();
        int leftStudents = 0;

        for(int i=0;i<students.length;i++){
            studentsQueue.add(students[i]);
        }


        return leftStudents;
    }
}
