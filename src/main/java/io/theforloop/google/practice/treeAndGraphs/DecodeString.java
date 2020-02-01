package io.theforloop.google.practice.treeAndGraphs;

import java.util.Stack;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/explore/interview/card/google/61/trees-and-graphs/3073/
* */
public class DecodeString {
    public String decodeString(String s) {
        return "";
    }
    private String dString(String s){
        if(s == null || s.isEmpty()){
            return "";
        }
        int index = 0 ;
        int len = s.length()-1;
        String res = "";
        while (index < len && s.charAt(index)>='a' && s.charAt(index)<='z'){
            res = res.concat(s.charAt(index)+"");
            index++;
        }
        if(index == len){
            return res;
        }
        String intStr = "";
        while (index < len && s.charAt(index)>='0' && s.charAt(index)<='9'){
            intStr = intStr.concat(s.charAt(index)+"");
            index++;
        }
        Integer rep = Integer.parseInt(intStr);
        index++;
        int opening = 0 ,closing = 0 ;
        while (opening>=closing){
            if(s.charAt(index)=='['){
                opening++;
            }
            if(s.charAt(index)==']'){
                closing++;
                opening--;
            }
            intStr = intStr.concat(s.charAt(index)+"");
        }
        return "";
    }
}
