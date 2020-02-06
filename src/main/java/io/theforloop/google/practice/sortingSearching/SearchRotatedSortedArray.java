package io.theforloop.google.practice.sortingSearching;

/**
 * @author Shubham
 */
public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length-1;
        if(high==-1){
            return -1;
        }
        if(high==0){
            return nums[0]==target?0:-1;
        }
        int pivotIndex = -1;
        if(nums[low]<nums[high]){
            pivotIndex = 0 ;
        }else{
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] == target){
                    return mid;
                }
                if(nums[mid] > nums[mid+1]){
                    pivotIndex = mid+1;
                    break;
                }
                if(nums[mid] < nums[low]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            if(nums[0] <= target){
                low = 0 ;
                high = pivotIndex-1;
            }else{
                low = pivotIndex ;
                high = nums.length-1;
            }
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
