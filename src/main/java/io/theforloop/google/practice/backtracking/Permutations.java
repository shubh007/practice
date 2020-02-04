package io.theforloop.google.practice.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int val:nums){
            list.add(val);
        }
        allPermutations(list,0);
        return result;
    }
    private void allPermutations(List<Integer> nums,int index){
        if(index == nums.size()-1){
            result.add(nums);
            return;
        }
        int currVal = nums.get(index);
        for(int i = index;i<nums.size();i++){
            List<Integer> currList = new ArrayList<>(nums);
            currList.set(index,currList.get(i)) ;
            currList.set(i,currVal);
            allPermutations(currList,index+1);
        }
    }

}
