package org.example.Tree;

public class BinaryTree {

    public BstNode insertNode(BstNode root,int value){

        if(root == null){
            root = getNewNode(value);
            System.out.print(root.data + " ");
        } else if(value <= root.data){
            root.left = insertNode(root.left,value);
        } else{
            root.right = insertNode(root.right,value);
        }
        return root;
    }

    public BstNode getNewNode(int value){

        BstNode bstNode = new BstNode();
        bstNode.data = value;
        bstNode.left = null;
        bstNode.right = null;

        return bstNode;
    }

    public boolean searchNode(BstNode root,int value){

        if(root == null){
            return false;
        }else if(value == root.data){
            return true;
        } else if(value <= root.data){
            return searchNode(root.left,value);
        } else{
            return searchNode(root.right,value);
        }
    }

    public void findMax(BstNode root){
        if(root == null){
            System.out.println("tree has no elements!");
        }

        while(root.right != null){
            root = root.right;
        }

        System.out.println("Max value :: "+root.data);
    }

    public void findMin(BstNode root){

        if(root == null){
            System.out.println("tree has no elements!");
        }

        while(root.left != null){
            root = root.left;
        }

        System.out.println("Min value :: "+root.data);
    }

    public int findMinRecur(BstNode root){

        if(root == null){
            System.out.println("tree has no elements!");
        } else if(root.left == null){
            return root.data;
        }

        return findMinRecur(root.left);
    }

    public int findMaxRecur(BstNode root){

        if(root == null){
            System.out.println("tree has no elements!");
        } else if(root.right == null){
            return root.data;
        }

        return findMinRecur(root.right);
    }
}
