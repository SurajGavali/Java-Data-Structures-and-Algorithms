package org.example;

import org.example.Arrays.Arrays;
import org.example.DoublyLinkList.DoublyLinkList;
import org.example.LinketList.LinkedList;
import org.example.Sorting.SortingAlgorithms;
import org.example.Stack.Stack;
import org.example.Tree.BinaryTree;
import org.example.Tree.BstNode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int nums[] = {4,6,23,43,6,45,23534,6,634,56,46,645,546};
        int target = 645;

        Arrays arrays = new Arrays();
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        System.out.println("Number found at index(Linear Search) :: "+arrays.linearSearch(nums,target));

        System.out.print("Before Sorting :: ");
        for(int i : nums){

            System.out.print(i + " ");
        }
        System.out.println("");

//        sortingAlgorithms.bubbleSort(nums);
//        sortingAlgorithms.selectionSort(nums);
//        sortingAlgorithms.insertionSort(nums);
//        sortingAlgorithms.quickSort(nums,0,nums.length-1);
        sortingAlgorithms.mergeSort(nums,0,nums.length-1);

        System.out.print("After Sorting :: ");
        for(int i : nums){

            System.out.print(i + " ");
        }

        System.out.println("\nNumber found at index(Binary Search) :: "+arrays.binarySearch(nums,target));
        System.out.println("Number found at index(Recursive Approach) :: "+arrays.binarySearchRecursiveApproach(nums,target,0,nums.length));

        System.out.println("-----------------------------------Linked List Output----------------------------------------");

        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(18);
        linkedList.insertAtEnd(8);
        linkedList.insertAtEnd(0);
        linkedList.insertAtEnd(234);
        linkedList.insertAtEnd(56);
        linkedList.insertAtEnd(67);

        linkedList.insertAtStart(67);
        linkedList.insertAtStart(45);

        linkedList.insertAt(4,890);
        linkedList.insertAt(1,12345);
        linkedList.insertAt(0,765);

        linkedList.deleteFromStart();

        linkedList.printLinkedList();
        System.out.println();
        linkedList.delete(0);
        linkedList.printLinkedList();

        linkedList.reverseLinkList();
        System.out.println();
        linkedList.printLinkedList();
        System.out.println();

        linkedList.printLinkedListRecur(linkedList.head);
        System.out.println();
        linkedList.printLinkedListRecurReverse(linkedList.head);
        System.out.println();

        ///////////////////////////////////////////////////////////////////

        DoublyLinkList doublyLinkList = new DoublyLinkList();

        doublyLinkList.insertAtHead(14);
        doublyLinkList.insertAtHead(17);
        doublyLinkList.insertAtHead(13);
        doublyLinkList.insertAtHead(87);
        doublyLinkList.insertAtHead(98);
        doublyLinkList.insertAtEnd(45);

        doublyLinkList.printDoublyLinkedList();
        doublyLinkList.printDoublyLinkedListReverse();

        //////////////////////////////////////////////////////////////////////

        Stack stack = new Stack();

        stack.push(12);
        stack.push(17);
        stack.push(87);
        stack.push(56);
        stack.push(23);

        stack.printStack();
        System.out.println();

        stack.pop();

        stack.printStack();
        System.out.println();

        ////////////////////////////////////////////////////////////////////////

        BinaryTree binaryTree = new BinaryTree();

        BstNode root = null;

        root = binaryTree.insertNode(root,15);
        root = binaryTree.insertNode(root,10);
        root = binaryTree.insertNode(root,20);
        root = binaryTree.insertNode(root,25);
        root = binaryTree.insertNode(root,8);
        root = binaryTree.insertNode(root,12);
        System.out.println("");

        binaryTree.levelOrderTraversal(root);

        if(binaryTree.searchNode(root,25)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        binaryTree.findMax(root);
        binaryTree.findMin(root);

        System.out.println("Min value using recursion "+ binaryTree.findMinRecur(root));
        System.out.println("Max value using recursion "+ binaryTree.findMaxRecur(root));
        System.out.println("Height of the tree is :: "+ binaryTree.findHeight(root));

        System.out.print("PreOrder Traversal :: ");
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal :: ");
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.print("Inorder Traversal :: ");
        binaryTree.inOrderTraversal(root);

        System.out.println();

        if(binaryTree.isBST(root)){
            System.out.println("Tree is BST");
        } else{
            System.out.println("Tree is Not BST");
        }

        binaryTree.preOrderTraversal(root);
        binaryTree.deleteNodeFromTree(root,25);
        System.out.println();
        binaryTree.preOrderTraversal(root);

    }
}