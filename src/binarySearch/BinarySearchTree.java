package binarySearch;

class Node{
    int key;
    Node left,right ;

    public Node(int key){
        this.key = key;
        left = right = null;
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {

        Node root = new Node(100);
        insert(root,20);
        insert(root,500);
        insert(root,10);
        insert(root,30);
        System.out.println("Printing elements in BFS");
        display(root);

        System.out.println("finding ele");
        System.out.println(findEleInBST(root,30));

    }


    //Function to insert node - Binary First Search
    public static Node insert(Node root, int val){
        //if root is null create node
        if(root == null) return createNode(val);
        //if found duplicate return root
        if(root.key == val) return root;
        if(val < root.key)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    private static Node createNode(int val){
        return new Node(val);
    }


    //Displaying elements - Used In Order technique so elements are displayed in sorting order ( Ascending )
    public static void display(Node root){
        if(root == null) return;
        display(root.left);
        System.out.println(root.key);
        display(root.right);
    }

    //Function to search element
    public static boolean findEleInBST(Node root, int val){
        if(root == null) return false;
        if(root.key == val) return true;
        return (val > root.key) ? findEleInBST(root.right,val) : findEleInBST(root.left,val);
    }



}
