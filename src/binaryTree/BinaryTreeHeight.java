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

        System.out.println("finding height of binary tree using dfs");
        System.out.println(treeHeight(root));

    }


    //Function to return height of a binary tree using bfs or level order traversal
    //Height - Number of nodes from root to the deepest node.
    public static int heightOfTree(Node root){
        int height = -1;
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

    //Function to return height of a binary tree using dfs
    //Height - Number of nodes from root to the deepest node.
    public static int treeHeight(Node root){
        if(root == null) return -1;
        var left = treeHeight(root.left);
        var right = treeHeight(root.right);
        return Math.max(left,right) + 1;
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
