package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
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
    public static void main(String[] args) {


    }

    public int maxDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int queueSize = queue.size();

            for(int i=0;i<queueSize;i++){
                TreeNode curr = queue.poll();
                if(curr.left != null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            depth++;

        }
        return depth+1;
    }
}
