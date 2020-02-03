package io.theforloop.google.practice.dynamicProgramming.dp;

import java.util.Arrays;

/**
 * @author Shubham
 */
public class JumpGameV {
    public int maxJumps(int[] arr, int d) {
        if(arr.length <=1){
            return arr.length;
        }
        int len = arr.length;
        int[] dist = new int[len];
        Arrays.fill(dist,-1);
        int max = 0 ;
        for(int index = 0 ; index < len ; index++){
            max = Math.max(max,recursive(arr,index,d,len,dist));
        }
        return max;
    }
    private int recursive(int[] arr,int currIndex,int d,int len,int[] dist){
        if(dist[currIndex]!=-1){
            return dist[currIndex];
        }
        int start = currIndex-d>=0?currIndex-d:0;
        int end = currIndex+d<len?currIndex+d:len-1;
        int max = 0 ;
        for(int index = currIndex+1;index<=end;index++){
            if(arr[index] < arr[currIndex] ){
                max = Math.max(max,recursive(arr,index,d,len,dist));
            }else{
                break;
            }
        }
        for(int index = currIndex-1;index>=start;index--){
            if(arr[index] < arr[currIndex] ){
                max = Math.max(max,recursive(arr,index,d,len,dist));
            }else{
                break;
            }
        }
        max++;
        dist[currIndex] = Math.max(max,dist[currIndex]);
        return max;
    }
}
