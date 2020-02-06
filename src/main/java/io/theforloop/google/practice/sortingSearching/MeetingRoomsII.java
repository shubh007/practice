package io.theforloop.google.practice.sortingSearching;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author Shubham
 */
public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        int minRooms = 0 ;
        Arrays.sort(intervals,(int[] a, int[] b)->{
            return a[0]-b[0];
        });
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b)->{
            return a[1]-b[1];
        });
        for(int[] interval : intervals ){
            while(!pq.isEmpty() && pq.peek()[1] <= interval[0]){
                pq.poll();
            }
            pq.add(interval);
            minRooms = Math.max(minRooms,pq.size());
        }
        return minRooms;
    }
}
