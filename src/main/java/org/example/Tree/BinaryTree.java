package org.example.Tree;

import java.util.LinkedList;
import java.util.Queue;

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

    public int findHeight(BstNode root){

        if(root == null){
            return -1;
        }

        return Math.max(findHeight(root.left),findHeight(root.right)) + 1;
    }

    public void levelOrderTraversal(BstNode root){

        if(root == null){
            return;
        }

        Queue<BstNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BstNode bstNode = queue.poll();
            System.out.print(bstNode.data + " ");

            if(bstNode.left != null){
                queue.add(bstNode.left);
            }

            if(bstNode.right != null){
                queue.add(bstNode.right);
            }
        }


    }
}
