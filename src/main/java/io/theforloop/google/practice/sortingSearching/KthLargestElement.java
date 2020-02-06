package io.theforloop.google.practice.sortingSearching;

import java.util.PriorityQueue;

/**
 * @author Shubham
 */
public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val:nums){
            if(pq.size()==k && val > pq.peek()){
                pq.poll();
                pq.add(val);
            }else if(pq.size()<k){
                pq.add(val);
            }

        }
        return pq.peek();
    }
}
