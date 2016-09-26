import java.util.*;
import java.lang.*;
import java.io.*;


public class BinaryTreeNodeprintReverseorder{

    public int data;
    public BinaryTreeNodeprintReverseorder left, right;
    public BinaryTreeNodeprintReverseorder(int data){

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

    public BinaryTreeNodeprintReverseorder getLeft(){
        return left;
    }

    public void setLeft(BinaryTreeNodeprintReverseorder left){
        this.left = left;
        
    }

    public BinaryTreeNodeprintReverseorder getRight(){
        return right;
    }

    public void setRight(BinaryTreeNodeprintReverseorder right){
        this.right = right;
        
    }

    public static void levelOrderTraverse(BinaryTreeNodeprintReverseorder root){

        if (root==null) {
           return; 
        }
        Stack<BinaryTreeNodeprintReverseorder> s =new Stack<BinaryTreeNodeprintReverseorder>();
        Queue<BinaryTreeNodeprintReverseorder> q = new LinkedList<BinaryTreeNodeprintReverseorder>();

        q.offer(root);

        while (!q.isEmpty()) {

            BinaryTreeNodeprintReverseorder tmp = q.poll();
            

            if (tmp.getRight() != null) {
                q.offer(tmp.getRight());
            }
            if (tmp.getLeft() !=null) {
                q.offer(tmp.getLeft());
            }

            s.push(tmp);
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop().getData() + " ");
            
        }

    }


    public static void main(String[] args) {
        BinaryTreeNodeprintReverseorder root = new BinaryTreeNodeprintReverseorder(1);  
        BinaryTreeNodeprintReverseorder rootleft = new BinaryTreeNodeprintReverseorder(2);
        root.setLeft(rootleft);
        BinaryTreeNodeprintReverseorder rootright = new BinaryTreeNodeprintReverseorder(3);
        root.setRight(rootright);
        BinaryTreeNodeprintReverseorder rootleftleft = new BinaryTreeNodeprintReverseorder(4);
        rootleft.setLeft(rootleftleft);
        BinaryTreeNodeprintReverseorder rootleftright = new BinaryTreeNodeprintReverseorder(5);
        rootleft.setRight(rootleftright);
        BinaryTreeNodeprintReverseorder rootrightleft = new BinaryTreeNodeprintReverseorder(6);
        rootright.setLeft(rootrightleft);
        BinaryTreeNodeprintReverseorder rootrightright = new BinaryTreeNodeprintReverseorder(7);        
        rootright.setRight(rootrightright);
        levelOrderTraverse(root);
    }


}

 
