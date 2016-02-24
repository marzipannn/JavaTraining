/**
 * Created by Cinnamon on 2/23/16.
 */
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }
    public void insert(int value) {
        this.root = insertNode(this.root, value);
    }

    private Node insertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        }
        else {
            if (value <= node.value)
                node.left = insertNode(node.left, value);
            else
                node.right = insertNode(node.right, value);
        }
        return node;
    }

    public void traverse() {
        traverse(this.root);
    }

    private void traverse(Node node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            System.out.println(node.value);
        else {
            traverse(node.left);
            traverse(node.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.traverse();
    }
}