package io.theforloop.google.practice.sortingSearching;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Shubham
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(int[] a, int[] b)->{
            return a[0]-b[0];
        });
        Stack<int[]> stack = new Stack<>();
        for(int[] interval : intervals ){
            if(stack.isEmpty()){
                stack.push(interval);
            }else{
                int[] prevInterval = stack.pop();
                if(prevInterval[1] < interval[0]){
                    stack.push(prevInterval);
                    stack.push(interval);
                }else{
                    if(prevInterval[1] < interval[1]){
                        prevInterval[1] = interval[1];
                    }
                    stack.push(prevInterval);
                }
            }
        }
        int size = stack.size();
        int[][] res = new int[size][2];
        for(int index = size-1 ; index >=0 ;index--){
            res[index] = stack.pop();
        }
        return res;
    }
}
