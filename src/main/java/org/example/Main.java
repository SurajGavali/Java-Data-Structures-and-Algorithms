package org.example;

import org.example.Arrays.Arrays;
import org.example.Sorting.SortingAlgorithms;

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
    }
}