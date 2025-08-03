package binaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeHeight {

    public static void main(String[] args) {

        Node root = insertNode(null,2);
        Node n1 = insertNode(root,2);
        Node n2 = insertNode(root,3);
        Node n3 = insertNode(root,4);
        Node n4 = insertNode(root,5);

        System.out.println(heightOfTree(root));

    }

    public static int heightOfTree(Node root){
        int height = 0;
        if(root==null) return height;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();

            if(curr.left != null){
                queue.add(curr.left);
            }else if(curr.right != null){
                queue.add(curr.right);
            }
            height++;
        }

        return height;
    }

    public static Node insertNode(Node root,int val){
        if(root==null) return createNode(val);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            if(curr.left == null){
                curr.left = createNode(val);
                break;
            }else queue.add(curr.left);
            if(curr.right == null){
                curr.right = createNode(val);
                break;
            }else queue.add(curr.right);
        }
        return root;
    }

    public static Node createNode(int val){
        return new Node(val);
    }


}
