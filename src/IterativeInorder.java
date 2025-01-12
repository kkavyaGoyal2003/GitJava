import java.util.*;
public class IterativeInorder {
    static class TreeNode {
        int value ;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    static void Inorder(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        TreeNode node = root;
        if(root == null) {
            System.out.println("Empty tree");
        }
        while(true) {
            if(node != null) {
                stk.push(node);
                node = node.left;
            } else {
                if(stk.isEmpty()) break;
                node = stk.pop();
                System.out.println(node.value);
                node = node.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right =  new TreeNode(6);
        root.right = new TreeNode(7);
        Inorder(root);
    }
}
