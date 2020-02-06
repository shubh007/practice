package io.theforloop.google.practice.sortingSearching;

import java.util.*;

/**
 * @author Shubham
 */
public class TopKFrequentElements {
    private class Res{
        int num;
        int freq;
        Res(int num,int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Res> map = new HashMap<>();
        for(int val:nums){
            Res res = map.getOrDefault(val,new Res(val,0));
            res.freq++;
            map.put(val,res);
        }
        PriorityQueue<Res> pq = new PriorityQueue<>((res1, res2)->{
            return res1.freq - res2.freq;
        });
        for(Res res:map.values()){
            if(pq.size()==k && res.freq > pq.peek().freq){
                pq.poll();
                pq.add(res);
            }else if(pq.size()<k){
                pq.add(res);
            }

        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()){
            result.add(pq.poll().num);
        }
        return result;
    }
}
