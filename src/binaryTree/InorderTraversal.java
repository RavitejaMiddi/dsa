package binaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class InorderTraversal {
     static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node1.left = node2;
        TreeNode node3 = new TreeNode(4);
        node1.right = node3;
        TreeNode node4 = new TreeNode(5);
        node2.left = node4;
        TreeNode node5 = new TreeNode(6);
        node2.right = node5;

        for(int val:inorderTraversal(node1)){
            System.out.println(val);
        }
        inOrderDfs(node1);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        inorder(root);
      return list;

    }
    // In-order DFS: Left, Root, Right
    static void inOrderDfs(TreeNode node){
        if(node == null) return;
        inOrderDfs(node.left);
        System.out.print(node.val+ " ");
        inOrderDfs(node.right);
    }

    static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }


}
