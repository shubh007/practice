package io.theforloop.google.practice.sortingSearching;

/**
 * @author Shubham
 */
public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(nums.length == 0){
            return res;
        }
        int high = nums.length-1;
        int low = 0 ;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target &&( mid==0 || nums[mid-1] < target)){
                res[0] = mid;
                break;
            }else if(nums[mid] >= target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(res[0]==-1){
            return res;
        }
        high = nums.length-1;
        low = 0 ;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target &&( mid==nums.length-1 || nums[mid+1] > target)){
                res[1] = mid;
                break;
            }else if(nums[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
}
