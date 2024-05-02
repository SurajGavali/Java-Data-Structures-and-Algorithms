package org.example.Sorting;

public class SortingAlgorithms {

    /**
    * Time Complexity - O(n^2)
    * */
    public int[] bubbleSort(int[] nums){
        int temp = 0;

        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length-1-i; j++){

                if(nums[j+1] < nums[j]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    /**
     * Time Complexity - O(n^2)
     * But swapping of numbers happening in outer loop only
     * */
    public int[] selectionSort(int nums[]){

        int minIndex = -1;
        int temp = 0;

        for(int i=0; i < nums.length; i++){
            minIndex = i;
            for(int j=i+1; j < nums.length; j++){

                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }

    public int[] insertionSort(int[] nums){

        for(int i=1; i < nums.length; i++){
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > temp){

                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = temp;
        }

        return nums;
    }

    /**
     * Time Complexity - O(n log(n))
     * But swapping of numbers happening in outer loop only
     * */

    public int[] quickSort(int[] nums,int low, int high){

        if(low < high){
            int pivot = createPartition(nums,low,high);
            quickSort(nums,low,pivot - 1);
            quickSort(nums,pivot + 1,high);
        }

        return nums;
    }

    private int createPartition(int[] nums,int low,int high){

        int pivot = nums[high];
        int i = low - 1;

        for(int j=low; j < high; j++){
            if(nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }

    public int[] mergeSort(int[] nums,int l,int r){

        int mid = (l+r)/2;
        if(l < r) {
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }

        return nums;

    }

    public void merge(int[] nums, int l,int mid, int r){

        int leftArraySize = mid - l + 1;
        int rightArraySize = r - mid;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for(int i=0; i < leftArraySize; i++){

            leftArray[i] = nums[l+i];

        }

        for(int i=0; i < rightArraySize; i++){

            rightArray[i] = nums[mid+1+i];

        }

        int x = 0;
        int y = 0;
        int z = l;

        while((x < leftArraySize && y < rightArraySize) && (x < leftArraySize && y < rightArraySize)){

            if(leftArray[x] <= rightArray[y]){
                nums[z] = leftArray[x];
                x++;
            } else{

                nums[z] = rightArray[y];
                y++;
            }
            z++;
        }

        while(x < leftArraySize){
            nums[z] = leftArray[x];
            x++;
            z++;
        }

        while(y < rightArraySize){
            nums[z] = rightArray[y];
            y++;
            z++;
        }

    }
}
