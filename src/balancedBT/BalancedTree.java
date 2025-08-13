package balancedBT;


import java.util.LinkedList;
import java.util.Queue;

//Node
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}



public class BalancedTree {
    public static boolean isBalanced(Node root){
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    private static int height(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static void insert(Node root,int val){
        if(root == null) return;createNode(val);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

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

    }
    private static Node createNode(int val){
        return new Node(val);
    }

    public static void traversal(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        traversal(root.left);
        traversal(root.right);
    }
    public static void main(String[] args) {

        Node root = new Node(1);
//        insert(root,2);
//        insert(root,3);
//        insert(root,4);
//        insert(root,5);
//        insert(root,6);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(3);
        traversal(root);

        System.out.println(isBalanced(root));

    }
}
