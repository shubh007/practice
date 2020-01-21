package io.theforloop.google.practice.arrayAndString;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shubham
 */
public class Grouping {
    public int maxGroup(int input1,int[] input2){
        int grpCount = 0 ;
        Set<Integer> grps = new HashSet<>();
        for(int index = 0;index < input1;index++){
            if(grps.contains(input2[index])){
                grpCount++;
                grps.clear();
            }else {
                grps.add(input2[index]);
            }
        }
        return grpCount;
    }
}
