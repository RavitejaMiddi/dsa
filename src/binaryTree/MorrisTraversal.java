package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class MorrisTraversal {

    //Morris order of traversal - In order
    static ArrayList<Integer> getInorder(Node root){
        Node curr = root;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (curr!= null){
            if(curr.left == null){
                arrayList.add(curr.key);
                curr = curr.right;
            }else {
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else {
                    prev.right = null;
                    arrayList.add(curr.key);
                    curr = curr.right;
                }
            }
        }
        return arrayList;
    }
    //Morris order of traversal - Pre Order

    static ArrayList<Integer> preOrderTraversal(Node root){
        Node curr = root;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(curr != null){
            if(curr.left == null){
                arrayList.add(curr.key);
                curr = curr.right;
            }else {
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    arrayList.add(curr.key);
                    curr = curr.left;
                }else {
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
        return arrayList;
    }


    //Function to insert new node into binary tree
    static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }

        Queue<binaryTree.Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            binaryTree.Node temp = queue.poll();
            //If left child is empty insert new node there if not add left to queue
            if(temp.left == null){
                temp.left = new binaryTree.Node(key);
                break;
            }else
                queue.add(temp.left);
            //If right child is empty insert new node there if not add right node to queue
            if(temp.right == null){
                temp.right= new binaryTree.Node(key);
                break;
            }else
                queue.add(temp.right);

        }

        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
     insert(root,2);
     insert(root,4);
     insert(root,5);
     insert(root,6);
     insert(root,9);
     insert(root,10);
     insert(root,15);

        System.out.println("In order Traversal : ");
     for(int val :getInorder(root)){
         System.out.print(val + " ");
     }
        System.out.println();
        System.out.println("Pre order Traversal : ");
     for(int val :preOrderTraversal(root)){
         System.out.print(val + " ");
     }


    }
}
