package TreePractice;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class ImplementBinaryTree {
    public static void preorder(TreeNode root) {
        if(root != null) {
            System.out.print(root.data + "  ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        Queue<TreeNode> queue = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the root: ");
        int x = scan.nextInt();
        TreeNode root = new TreeNode(x);
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            queue.poll();
            System.out.print("Enter the left child: ");
            int left = scan.nextInt();
            if(left != -1) {
                temp.left = new TreeNode(left);
                queue.offer(temp.left);
            }
            System.out.print("Enter the right child:");
            int right = scan.nextInt();
            if(right != -1) {
                temp.right = new TreeNode(right);
                queue.offer(temp.right);
            }
        }
        System.out.print("Preorder=>  ");
        preorder(root);
    }
}
