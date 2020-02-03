package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if(len < 3){
            return false;
        }
        int[] helper = new int[len];
        int max = 0 ;
        helper[0] = 1 ;
        for(int i = 1 ; i < len ; i++){
            int cmax = 0 ;
            for(int j = i-1 ; j>=0 ; j--){
                if(nums[i] > nums[j]){
                    cmax = Math.max(cmax,helper[j]);
                }
            }
            helper[i] = cmax+1;
            max = Math.max(max,helper[i]);
            if(max >= 3){
                return true;
            }
        }
        return false;
    }
}
