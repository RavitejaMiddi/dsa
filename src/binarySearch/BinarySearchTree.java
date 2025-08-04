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

        System.out.println("deletion");
        delete(root,20);
        display(root);

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

    public static Node delete(Node root, int val){

        if(root == null) return root;
        if(root.key > val){
            root.left = delete(root.left,val);
        } else if (root.key < val) {
            root.right = delete(root.right,val);
        }else {
            //first if root doesn't have any children delete it
            if(root.left == null && root.right == null)
                root = null;
            else if (root.right!=null) { //if it has right child
                    root.key = successor(root);
                    root.right = delete(root.right,root.key);
            }else {
                root.key = predecessor(root);
                root.left = delete(root.left,root.key);
            }
        }
        return root;
    }

    private static int predecessor(Node root) {
        root = root.left;
        while(root.right != null)
            root = root.right;
        return root.key;
    }

    private static int successor(Node root) {
        root = root.right;
        while(root.left != null)
            root = root.left;
        return root.key;
    }


}
