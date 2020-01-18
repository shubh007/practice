package io.theforloop.google.practice.dynamicProgramming.minMaxPathToTarget;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/minimum-cost-for-tickets/
* */
public class MinimumCostForTickets {
    public int minCostTickets(int[] days, int[] costs) {
        int[] duration = {1,7,30};
        Set<Integer> daysSet = new HashSet<>();
        for(int day :days){
            daysSet.add(day);
        }
        int[] res = new int[days[days.length-1]+1];
        res[0] = 0 ;
        for(int day = 1 ; day<res.length ; day++){
            if(!daysSet.contains(day)){
                res[day] = res[day-1];
                continue;
            }
            res[day] = costs[0] + res[day-duration[0]];
            for(int cost = 1 ; cost < costs.length ; cost++){
                int temp = costs[cost];
                if(day>=duration[cost]){
                    temp += res[day-duration[cost]];
                }
                res[day] = Math.min(res[day],temp);
            }
        }
        return res[res.length-1];
    }
}
