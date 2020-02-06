package io.theforloop.google.practice.sortingSearching;

/**
 * @author Shubham
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        for(int index = 0 ; index < nums.length ;index++){
            if(index!=0
                    && index != nums.length-1
                    && nums[index-1] < nums[index]
                    && nums[index+1] < nums[index]){
                return index;
            }else if(index==0
                    && nums[index+1] < nums[index] ){
                return index;
            }else if(index == nums.length-1
                    && nums[index-1] < nums[index]  ){
                return index;
            }
        }
        return 0 ;
    }
}
