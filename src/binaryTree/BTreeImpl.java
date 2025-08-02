package binaryTree;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
        this.left = this.right = null;
    }
}

//Binary Tree class
public class BTreeImpl {
    private static int size = 0;
    // In-order DFS: Left, Root, Right
    static void inOrderDfs(Node node){
        if(node == null) return;
        inOrderDfs(node.left);
        System.out.print(node.key+ " ");
        inOrderDfs(node.right);
    }
    // Pre-order DFS: Root,Left, Right
    static void preOrderDfs(Node node){
        if(node == null) return;
        System.out.print(node.key + " ");
        preOrderDfs(node.left);
        preOrderDfs(node.right);
    }
    // Post-order DFS: Left, Right,Root
    static void postOrderDfs(Node node){
        if(node == null) return;
        postOrderDfs(node.left);
        postOrderDfs(node.right);
        System.out.print(node.key + " ");
    }

    // BFS: Level order traversal
    static void BFS(Node root){
        if(root == null)return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.key + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

    }

    //Function to insert new node into binary tree
    static Node insert(Node root, int key){
        if(root == null){
            size++;
            return new Node(key);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.poll();
            //If left child is empty insert new node there if not add left to queue
            if(temp.left == null){
                temp.left = new Node(key);
                size++;
                break;
            }else
                queue.add(temp.left);
            //If right child is empty insert new node there if not add right node to queue
            if(temp.right == null){
                temp.right= new Node(key);
                size++;
                break;
            }else
                queue.add(temp.right);

        }

    return root;
    }


    //Function to search for an element in BTree using DFS
    static boolean searchDFS(Node root,int value){
        if(root == null) return false;

        if(root.key == value) return true;

        //Recursively search in left and right subtrees
        boolean left_res = searchDFS(root.left,value);
        boolean right_res = searchDFS(root.right,value);

        //Other approach it stops looking If value is in the left subtree, it won’t check the right subtree.
//        if(searchDFS(root.left,value)) return true;
//        if(searchDFS(root.right,value)) return true;
//
//        return false;

        return left_res || right_res;
    }
    //deleting a node from BTree
    static Node deleteNode(Node root,int val){

        Node target = null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        //Find target Node
        while(!queue.isEmpty()){
            Node curr = queue.poll();

            if(curr.key == val){
                target = curr;
                break;
            }
               if( curr.left != null)queue.add(curr.left);
               if( curr.right != null)  queue.add(curr.right);
        }


        //Find out last Node and its parent node
        Node lastNode = null;
        Node lastparentNode = null;
        Queue<Node> lastNodeQueue = new LinkedList<>();
        Queue<Node> parentNodeQueue = new LinkedList<>();

        lastNodeQueue.add(root);
        parentNodeQueue.add(null);

        while (!lastNodeQueue.isEmpty()){
            Node curr = lastNodeQueue.poll();
            Node parent = parentNodeQueue.poll();

            lastNode = curr;
            lastparentNode = parent;

            if(curr.left != null){
                lastNodeQueue.add(curr.left);
                parentNodeQueue.add(curr);
            }else if(curr.right!=null){
                lastNodeQueue.add(curr.right);
                parentNodeQueue.add(curr);
            }
        }

        target.key = lastNode.key;

        //make last node null
        if(lastparentNode != null){
            if(lastparentNode.left == lastNode) lastparentNode.left = null;
            else lastparentNode.right = null;
        }else
            return null;

        return root;
    }

    /* Depth of a BTree or Height */
    static int depthOfTree(Node root){
        int depth = 0;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){
            int levelSize = nodeQueue.size();

            //traverse all node at current level
            for(int i=0;i<levelSize;i++){
                Node curr = nodeQueue.poll();
                if(curr.left != null) nodeQueue.add(curr.left);
                if(curr.right!= null) nodeQueue.add(curr.right);
            }
            //Increment height after traversing each level
            depth++;

        }
        return depth -1 ;
    }

    /* Finding depth of BTree from specific node to root  */
    static int depthOfTreeSpecificNode(Node root, int value){
        int depth = 0;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){
            int levelSize = nodeQueue.size();

            //traverse all node at current level
            for(int i=0;i<levelSize;i++){
                Node curr = nodeQueue.poll();
                if(curr.key == value) {
                    nodeQueue.clear();
                    break;
                }
                if(curr.left != null) nodeQueue.add(curr.left);
                if(curr.right!= null) nodeQueue.add(curr.right);
            }
            //Increment height after traversing each level
            depth++;

        }
        return depth -1 ;
    }

    //Size of Binary Tree(Number of Elements in a Binary Tree)
    static int size(){
        return size;
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
//        System.out.print("In order: ");
//        inOrderDfs(root);
//        System.out.println();
//        System.out.print("Pre order: ");
//        preOrderDfs(root);
//        System.out.println();
//        System.out.print("Post order: ");
//        postOrderDfs(root);
//
//        System.out.println();
//        System.out.print("BFS : ");
//        BFS(root);
//
//        System.out.println();
//        System.out.println("Inserting elements to BTree");
          insert(root,9);
          insert(root,10);
          insert(root,15);
//        System.out.print("After Insertion : ");
//        BFS(root);
//        System.out.println();
//        System.out.println("Depth of Tree : "+ depthOfTree(root));
//        System.out.println();
//        System.out.println("Depth from specific Node : ");
//        System.out.println(depthOfTreeSpecificNode(root,5));
//
//        System.out.println();
//        System.out.println(searchDFS(root,4));
//
//
//        System.out.println();
//        System.out.println("Deleting a Node from BTree");
//        System.out.print("Before Deletion : ");
//        BFS(root);
//        deleteNode(root,2);
//        System.out.println();
//        System.out.print("After Deletion : ");
//        BFS(root);
//        System.out.println();
//        System.out.println("Depth of Tree : "+ depthOfTree(root));

        System.out.println("---------------------------------------------");
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println("---------------------------------------------");
        levelOrderBFS(root);
        System.out.println("-----------------------------------------");
        insertNode(root,30);
        levelOrderBFS(root);
        System.out.println("---------------------------------------");
        System.out.println(isPresent(root,90));


    }


    //Just for understanding
    //in order - left, root, right
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }
    //pre-order - root, left , right
     public static void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
     }

     //post-order - left,right,root

    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.key);
    }

    //BFS - level order traversal

    public static void levelOrderBFS(Node root){
        if(root==null)return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.print(curr.key + ",");
            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null)queue.add(curr.right);
        }
    }

    //Insertion - BFS approach

    public static Node insertNode(Node root,int val){
        if(root==null) return createNode(val) ;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            if(curr.left == null){
                curr.left = createNode(val);
                break;
            }
            else queue.add(curr.left);
            if(curr.right== null){
                curr.right = createNode(val);
                break;
            }
            else queue.add(curr.right);
        }
        return root;
    }
    public static Node createNode(int val){
        return new Node(val);
    }

    public static boolean isPresent(Node root,int val){
        if(root == null) return false;
        if(root.key == val) return true;
        return isPresent(root.left,val) || isPresent(root.right,val);
    }

    //function to find specific element position in a tree
    public static Node nodePosition(Node root,int val){
        if (root == null) return null;
        if(root.key == val) return root;
        Node left = nodePosition(root.left,val);
        if(left!= null)return left;
        return nodePosition(root.right,val);
    }
    //delete node from tree
    public static void deleteNodeApp2(Node root,int val){
        if(root==null)return;
        Node targetNode = nodePosition(root,val);
        if(targetNode!=null){
            Node lastNode = null;
            Node parentNode = null;
            Queue<Node> childQueue =  new LinkedList<>();
            Queue<Node> parentQueue = new LinkedList<>();
            childQueue.add(root);
            parentQueue.add(null);
            while(!childQueue.isEmpty()){
                Node curr = childQueue.poll();
                Node parent = parentQueue.poll();
                lastNode = curr;
                parentNode = parent;
                if(curr.left!=null){
                    childQueue.add(curr.left);
                    parentQueue.add(curr);
                }else if(curr.right != null) {
                    childQueue.add(curr.right);
                    parentQueue.add(curr);
                }
            }
            targetNode.key = lastNode.key;

            if(parentNode != null){
                if(lastNode == parentNode.left) parentNode.left = null;
                else parentNode.right = null;
            }else System.out.println("Unsuccessful Operation");

        }else {
            System.out.println("Node not found");
        }
    }


    }

