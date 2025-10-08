import java.util.*;

/**
 * Cleaned-up Main for Lecture 3 (Trees).
 *
 * Builds a binary tree from stdin using a simple pre-order format:
 * For every node that exists, provide:
 *   <int value> <boolean hasLeft> [left-subtree if hasLeft==true] <boolean hasRight> [right-subtree if hasRight==true]
 *
 * Example input for tree with root 1, left child 2 (no children) and right child 3 (no children):
 *   1 true 2 false false true 3 false false
 */
public class Main {

    // Simple Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Build tree from Scanner using the format described above.
    // This method is defensive: it checks hasNextX before consuming to avoid hangs on EOF.
    private static Node buildTree(Scanner sc) {
        if (sc == null) return null;
        if (!sc.hasNextInt()) return null;
        int val = sc.nextInt();
        Node node = new Node(val);

        // left
        if (!sc.hasNextBoolean()) return node;
        boolean hasLeft = sc.nextBoolean();
        if (hasLeft) {
            node.left = buildTree(sc);
        }

        // right
        if (!sc.hasNextBoolean()) return node;
        boolean hasRight = sc.nextBoolean();
        if (hasRight) {
            node.right = buildTree(sc);
        }

        return node;
    }

    // Print preorder traversal (node left right)
    private static void printPreOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private static void printPostOrder(Node root) {
        if (root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }
      private static int max (Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
      }

    private static void printInOrder(Node root){
        if(root == null)return;
        printInOrder(root.left);
        System.out.print(root.data + " ");  
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Try to build tree only if there's at least one token
        if (!sc.hasNext()) {
            System.out.println("No input provided. Provide tree data on stdin using the format described in the source.");
            sc.close();
            return;
        }

        Node root = buildTree(sc);
        sc.close();

        System.out.print("Preorder: ");
        printPreOrder(root);
        System.out.println();
    }
}