// package Lecture5(BST)(14Oct);

public class dia {
    public static class TreeNode {
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
        //now we have maken the tree class
    }   
    public static void main(String args[]){
        //now we need to find the diameter of tree without using array or list
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);    
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }
    
}
