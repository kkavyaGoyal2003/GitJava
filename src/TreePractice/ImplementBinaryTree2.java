package TreePractice;
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTree {
    Node root = null;
    void buildTree() {
        Scanner scan = new Scanner(System.in);
        root = BuildTree(scan);
    }
    Node BuildTree(Scanner scan) {
        System.out.print("Enter Node(-1 for no node): ");
        int data = scan.nextInt();

        if(data == -1) return null;

        Node temp = new Node(data);

        System.out.print("Enter the left child of "+ data + " : ");
        temp.left = BuildTree(scan);

        System.out.print("Enter the right child of "+ data + " : ");
        temp.right = BuildTree(scan);

        return temp;
    }
    void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + "  ");
            inorder(root.right);
        }
    }
    void display() {
        inorder(root);
    }
}
public class ImplementBinaryTree2 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.buildTree();
        System.out.println("Inoreder Traversal:");
        tree.display();
    }
}
