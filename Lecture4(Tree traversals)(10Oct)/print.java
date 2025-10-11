import java.util.*;
public class print {
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
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>>ans = new ArrayList<List<Integer>>();
        solve(root,ans);
        return ans;
    }
    private void solve(TreeNode root, List<List<Integer>>ans){
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node == null) continue;
                list.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            ans.add(list);
        }
    }
    public static void main(String args[]){
        //now we are making a tree

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);    
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        print obj = new print();
        List<List<Integer>> ans = obj.levelOrder(root);
        System.out.println(ans);
    }
}