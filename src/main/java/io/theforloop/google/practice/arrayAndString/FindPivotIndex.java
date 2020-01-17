package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
/*
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
 */
public class FindPivotIndex {
        public int pivotIndex(int[] nums) {
            int leftSum=0,sum=0;
            int len = nums.length;
            for(int val:nums){
                sum+=val;
            }
            for(int i=0; i<len;i++){
                if(leftSum == (sum-leftSum-nums[i])){
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }
}
