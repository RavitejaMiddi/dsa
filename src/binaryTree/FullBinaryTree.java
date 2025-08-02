package binaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class FullBinaryTree {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data =data;
            left = right = null;
        }
    }

    static boolean isFullTree(Node root){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if((root.left != null) && (root.right)!=null)
            return (isFullTree(root.left) && (isFullTree(root.right)));
        return false;
    }

    //Function to look if BTree is Full Tree or not
    static boolean isFullTreeBFS(Node root){
        if(root == null) return true;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            root = queue.peek();
            queue.remove();

            if(root == null)return false;

            if(!isLeafNode(root)){
                queue.add(root.left);
                queue.add(root.right);
            }
        }
        return true;

    }

    private static boolean isLeafNode(Node root) {
        return root.left == null && root.right == null;
    }

    //Function to insert new Node into BTree
    static Node insert(Node root,int val){
        if(root == null)return new Node(val);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();

            if (curr.left == null) {
                curr.left = new Node(val);
                break;
            } else {
                queue.add(curr.left);
            }
            if (curr.right == null) {
                curr.right = new Node(val);
                break;
            } else {
                queue.add(curr.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(12);
        insert(root,8);
        insert(root,18);
        insert(root,5);
        insert(root,11);
       // insert(root,9);
        System.out.println(isFullTree(root));
        System.out.println(isFullTreeBFS(root));


    }
}
