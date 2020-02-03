package io.theforloop.google.practice.arrayAndString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shubham
 */
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int len = nums.length;
        List<String> missingRanges = new ArrayList<>();
        if(len == 0){
            missingRanges.add(getRange(lower-1,upper+1));
            return missingRanges;
        }
        for(int i = 0 ; i <=len ; i++){
            String temp ;
            if(i==0){
                temp = getRange(lower-1,nums[i]);
            }else if(i==len){
                temp = getRange(nums[i-1],upper+1);
            }else{
                temp = getRange(nums[i-1],nums[i]);
            }
            if(!temp.isEmpty()){
                missingRanges.add(temp);
            }
        }
        return missingRanges;
    }
    private String getRange(int min,int max){
        if(max <= (min+1)){
            return "";
        }else if(max == min+2){
            return (min+1)+"";
        }else{
            return (min+1)+"->"+(max-1);
        }
    }
}
