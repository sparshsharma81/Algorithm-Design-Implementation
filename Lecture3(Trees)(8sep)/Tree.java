import java.util.Scanner;

/**
 * Self-contained Tree implementation with a small builder and preorder traversal.
 * Input format (preorder, with presence flags):
 *   <int value> <boolean hasLeft> [left-subtree if hasLeft==true] <boolean hasRight> [right-subtree if hasRight==true]
 */
public class Tree {

    // Simple Node class local to Tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    // Build tree from Scanner using the described format
    public void buildFromScanner(Scanner sc) {
        if (sc == null) return;
        this.root = buildTree(sc);
    }

    private Node buildTree(Scanner sc) {
        if (!sc.hasNextInt()) return null;
        int val = sc.nextInt();
        Node n = new Node(val);

        if (!sc.hasNextBoolean()) return n;
        boolean hasLeft = sc.nextBoolean();
        if (hasLeft) n.left = buildTree(sc);

        if (!sc.hasNextBoolean()) return n;
        boolean hasRight = sc.nextBoolean();
        if (hasRight) n.right = buildTree(sc);

        return n;
    }

    public void preorder() {
        preorder(this.root);
    }

    private void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Small testable main: reads tree from stdin and prints preorder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree t = new Tree();
        if (sc.hasNext()) t.buildFromScanner(sc);
        System.out.print("Preorder: ");
        t.preorder();
        System.out.println();
        sc.close();
    }
}
