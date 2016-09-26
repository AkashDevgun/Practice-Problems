import java.util.*;
import java.lang.*;
import java.io.*;


public class BinaryTreeNode{

    public int data;
    public BinaryTreeNode left, right;
    public BinaryTreeNode(int data){

        this.data = data;
        left = null;
        right = null;

    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }

    public void setLeft(BinaryTreeNode left){
        this.left = left;
        
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public void setRight(BinaryTreeNode right){
        this.right = right;
        
    }

    public static BinaryTreeNode LCA(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b){
        BinaryTreeNode left, right;

        if (root == null) {
            return root;
        }

        if (root == a || root == b) {
            return root;
        }

        left = LCA(root.left , a , b);
        right = LCA(root.right, a, b);
        if (left != null && right != null) {
            return root;
        }
        else
            return (left != null ? left : right);
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);

        System.out.println(LCA(root, root.left, root.right));
    }


}

 
