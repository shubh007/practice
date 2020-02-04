package io.theforloop.google.practice.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int val:nums){
            list.add(val);
        }
        allPermutations(list,0);
        return result;
    }
    private void allPermutations(List<Integer> nums,int index) {
        if (index == nums.size()) {
            List<Integer> currList = new ArrayList<>();
            for (Integer val : nums) {
                if (val != null)
                    currList.add(val);
            }
            result.add(currList);
            return;
        }
        List<Integer> firstList = new ArrayList<>(nums);
        firstList.set(index, null);
        allPermutations(firstList, index + 1);
        allPermutations(nums, index + 1);
    }
}
