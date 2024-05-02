package org.example.Arrays;

public class Arrays {

    public int linearSearch(int[] arr,int target){

        for(int i=0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursiveApproach(int[] arr, int target, int left, int right){

        int mid = (left+right)/2;

        if(left <= right){

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                return binarySearchRecursiveApproach(arr,target,left,mid-1);
            } else{
                return binarySearchRecursiveApproach(arr,target,mid+1,right);
            }
        }
        return -1;
    }
}
