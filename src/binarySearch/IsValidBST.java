package binarySearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class IsValidBST {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(100);
        TreeNode n1 = new TreeNode(200);
        root.left = n1;
        TreeNode n2 = new TreeNode(500);
        root.right = n2;
        TreeNode n3 = new TreeNode(10);
        n1.left = n3;
        TreeNode n4 = new TreeNode(30);
        n1.right = n4;

        System.out.println(validTree(root));

    }
//    public static boolean isValidBST(TreeNode root) {
//        if(root==null) return
//
//
//    }
    private static boolean validTree(TreeNode root){
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return isValidBSTHelper(node.left, min, node.val) &&
                isValidBSTHelper(node.right, node.val, max);
    }
}
