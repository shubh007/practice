package io.theforloop.google.practice.dynamicProgramming.dp;

/**
 * @author Shubham
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length==0){
            return false;
        }
        boolean[] isReachable = new boolean[nums.length];
        isReachable[nums.length-1] = true;
        for(int index = nums.length-2 ; index >= 0 ;index--){
            int limit = nums.length < index+nums[index]?nums.length-1:index+nums[index];
            int start = index+1;
            while(start<=limit){
                isReachable[index] = (isReachable[index] || isReachable[start]);
                start++;
            }
        }
        return isReachable[0];
    }
}
