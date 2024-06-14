package org.example.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    int MAX_VALUE = Integer.MAX_VALUE;
    int MIN_VALUE = Integer.MIN_VALUE;

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

    public BstNode findMinNode(BstNode root){

        if(root == null){
            System.out.println("tree has no elements!");
        }

        while(root.left != null){
            root = root.left;
        }

        return root;
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

    public void preOrderTraversal(BstNode root){

        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(BstNode root){

        if (root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void inOrderTraversal(BstNode root){

        if (root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);

    }

    private boolean isBSTUtil(BstNode root,int minValue,int maxValue) {

        if (root == null) {
            return true;
        }

        if(root.data > minValue && root.data < maxValue && isBSTUtil(root.left, minValue,root.data) && isBSTUtil(root.right,root.data,maxValue)){
            return true;
        } else {
            return false;
        }
    }
    public boolean isBST(BstNode root){

        return isBSTUtil(root,MIN_VALUE,MAX_VALUE);
    }

    public BstNode deleteNodeFromTree(BstNode root, int data){


        if(root == null){
            return null;
        } else if(data < root.data){
            root.left = deleteNodeFromTree(root.left,data);
        } else if(data > root.data){
            root.right = deleteNodeFromTree(root.right,data);
        } else{
            //case:1 No child
            if(root.left == null && root.right == null){
                root = null;
            }
            //case2: with only right child
            else if(root.left == null){

                BstNode temp = root;
                root = root.right;
                temp = null;
            }
            //case3: with only left child
            else if(root.right == null){

                BstNode temp = root;
                root = root.left;
                temp = null;
            }
            //case4: with both child
            else{

                BstNode temp = findMinNode(root.right);
                root.data = temp.data;
                root.right = deleteNodeFromTree(root.right,temp.data);
            }

        }
        return root;
    }
}
