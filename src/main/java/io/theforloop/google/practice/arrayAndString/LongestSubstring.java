package io.theforloop.google.practice.arrayAndString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham
 */
//LongestSubstringWithoutRepeatingCharacters
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.isEmpty()){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        Map<Character,Integer> lastCharIndex = new HashMap<>();
        int start = 0 , end = 0 , max = 0 ;
        int len = s.length();
        while(start < len && end < len){
            if(lastCharIndex.containsKey(s.charAt(end))){
                start = Math.max(lastCharIndex.get(s.charAt(end))+1,start);
            }
            max = Math.max(max,end-start+1);
            lastCharIndex.put(s.charAt(end),end++);

        }
        return max;
    }
}
