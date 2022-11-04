package BinaryTree;

import javax.swing.tree.TreeNode;

public class BinaryTree {

    private TreeNode root;


public static class TreeNode{

    private TreeNode left;
    private TreeNode right;
    private int data; //Generic type

    public TreeNode(int data){
        this.data=data;
        }
    }

    public void createBinaryTree(){

    TreeNode first = new TreeNode(9);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode fourth = new TreeNode(4);
    //TreeNode fifth = new TreeNode(5);

        root = first;   // root --> first
        first.left = second;
        first.right = third;    // 2 <--- 1 ---> 3

        second.left = fourth;
        //second.right = fifth;  // 4 <--- 2 ---> 5
    }


    /*
    * ---PreOrder Recursive Traversal of Binary Tree----
    *
    * // 4<--2<-- 9(root) -->3
    * */
    public void preOrder(TreeNode root){
    if (root == null){
        return;
    }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {

    BinaryTree bt = new BinaryTree();
    bt.createBinaryTree();
    bt.preOrder(bt.root);

    }
}
