import java.util.*;
public class IterativePreorder {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value= value;
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
        preorder(root);
    }
    static void preorder(TreeNode root){
        Stack<TreeNode> list = new Stack<>();
        if(root == null) {
            System.out.println("Empty Tree");
        } else {
            list.push(root);
            while(!list.isEmpty()) {
                TreeNode node = list.pop();
                System.out.println(node.value);
                if(node.right != null){
                    list.push(node.right);
                }
                if(node.left != null){
                    list.push(node.left);
                }
            }
        }
    }
}
