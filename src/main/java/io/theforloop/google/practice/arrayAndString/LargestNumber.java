package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
* */
public class LargestNumber {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max1=0,max2=1;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[max1] < nums[i]){
                max2 = max1;
                max1 = i;
            }else if(nums[max2] < nums[i]){
                max2 = i;
            }
        }
        if(nums[max2] <= nums[max1]>>1){
            return max1;
        }
        return -1;
    }
}
