package balancedBT;

class NodeAVL{
    int key;
    NodeAVL left;
    NodeAVL right;
    int height;

    public NodeAVL(int key){
        this.key = key;
        left = right = null;
        height = 1;
    }
}

public class AVLTree {

//    private static int height(NodeAVL node){
//        if(node == null)
//            return 0;
//        return node.height;
//    }
//    private static int getBalance(NodeAVL node){
//        if(node == null)
//            return 0;
//        return height(node.left) - height(node.right);
//    }


    public static NodeAVL insert(NodeAVL node,int key){
        if(node == null)
            return new NodeAVL(key);
        if(key < node.key)
            node.left = insert(node.left,key);
        else if(key > node.key)
            node.right = insert(node.right,key);
        else
            return node;
        //update height of this ancestor node
        node.height =  1 +  Math.max(height(node.left) , height(node.right));

        //get balance factor for this ancestor node
        int balance = getBalance(node);

        //If this becomes unbalanced there are 4 cases

        //left left case
        if(balance > 1 && key < node.left.key)
            return rightRotate(node);
        //right right case
        if(balance < -1 && key > node.right.key)
            return leftRotate(node);
        //right left case
        if(balance < -1 && key < node.right.key){
            node.right = rightRotate(node.right);
            leftRotate(node);
        }
        //left right case
        if(balance > 1 && key > node.left.key){
            node.left = leftRotate(node.left);
            rightRotate(node);
        }
        // Return the (unchanged) node pointer
        return node;
    }

    /*
            y                       x
         x      t3    ---->     t1      y
       t1  t2                       t2      t3



     */

//    private static NodeAVL rightRotate(NodeAVL y){
//        // Left child of the current node becomes the new root
//        NodeAVL x = y.left;
//        // The right child of the new root (which was the left child's right)
//        // becomes the left child of the old root (the original node)
//        NodeAVL T2 = x.right;
//
//        // The old root (the original node) becomes the right child of the new root
//        x.right = y;
//        // now t2(which is right of left child right becomes left of old node(ancestor node y)
//        y.left = T2;
//
//        // Update heights
//        y.height = 1 + Math.max(height(y.left),height(y.right));
//        x.height = 1+ Math.max(height(x.left),height(x.right));
//
//        // Return new root
//        return x;
//    }


    //right right case
//    private static NodeAVL leftRotate(NodeAVL x){
//        NodeAVL y = x.right;
//        NodeAVL t2 = y.left;
//
//        y.left = x;
//        x.right = t2;
//
//        // Update heights
//        x.height = 1+ Math.max(height(x.left),height(x.right));
//        y.height = 1 + Math.max(height(y.left),height(y.right));
//
//        return y;
//
//    }

    private static int height(NodeAVL node){
        if(node==null)
            return 0;
        return node.height;
    }
    private static int getBalance(NodeAVL node){
        if(node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    private static NodeAVL insertOperation(NodeAVL node,int val){
        if(node == null) return new NodeAVL(val);
        //if not null first we go through the deepest level by following bst property
        if( val < node.key)
            node.left = insertOperation(node.left,val);
        else if(val > node.key)
            node.right = insertOperation(node.right,val);
        else
            return node;

        node.height = 1 +  Math.max(height(node.left),height(node.right));

        int balance = getBalance(node);

        if(balance > 1 && val < node.left.key)
            return rightRotate(node);
        if(balance < -1 && val > node.right.key)
            return leftRotate(node);
        if(balance > 1 && val > node.left.key){
            node.left = leftRotate(node.left);
            rightRotate(node);
        }
        if(balance < -1 && val < node.right.key){
            node.right = rightRotate(node.right);
            leftRotate(node);
        }

        return node;
    }

    private static NodeAVL rightRotate(NodeAVL node){
        NodeAVL newRoot = node.left;
        NodeAVL T2 = newRoot.right;

        newRoot.right = node;
        node.left = T2;

        node.height = 1 + Math.max(height(node.left),height(node.right));
        newRoot.height = 1+ Math.max(height(newRoot.left),height(newRoot.right));

        return newRoot;
    }

    private static NodeAVL leftRotate(NodeAVL node){
        NodeAVL newRoot = node.right;
        NodeAVL T1 = newRoot.left;

        newRoot.left = node;
        node.right = T1;

        node.height = 1 + Math.max(height(node.left),height(node.right));
        newRoot.height = 1 + Math.max(height(newRoot.left),height(newRoot.right));

        return newRoot;
    }

    public  static void traversal(NodeAVL root){
        if(root == null)return;
        traversal(root.left);
        System.out.println(root.key);
        traversal(root.right);
    }
    public static void main(String[] args) {

        NodeAVL root = new NodeAVL(10);
        root = insertOperation(root,20);
        root = insertOperation(root,90);
        root = insertOperation(root,40);
        root = insertOperation(root,30);
        root = insertOperation(root,70);
        traversal(root);

    }

}
