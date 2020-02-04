package io.theforloop.google.practice.backtracking;

import java.util.*;

/**
 * @author Shubham
 */
public class LetterCombinationsPhoneNumber {
    private Map<Integer, List<Character>> map = new HashMap<>();
    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty() ){
            return new ArrayList<>();
        }
        map.put(2,new ArrayList<>(Arrays.asList('a','b','c')));
        map.put(3,new ArrayList<>(Arrays.asList('d','e','f')));
        map.put(4,new ArrayList<>(Arrays.asList('g','h','i')));
        map.put(5,new ArrayList<>(Arrays.asList('j','k','l')));
        map.put(6,new ArrayList<>(Arrays.asList('m','n','o')));
        map.put(7,new ArrayList<>(Arrays.asList('p','q','r','s')));
        map.put(8,new ArrayList<>(Arrays.asList('t','u','v')));
        map.put(9,new ArrayList<>(Arrays.asList('w','x','y','z')));
        map.put(0,new ArrayList<>(Arrays.asList(' ')));
        combinations(digits,0,"");
        return result ;
    }
    private void combinations(String digits,int index,String intermidiateResult){
        if(index == digits.length()){
            result.add(intermidiateResult);
            return;
        }
        List<Character> list = map.get(digits.charAt(index)-'0');
        for(Character charVal:list){
            combinations(digits,index+1,intermidiateResult+charVal);
        }
    }

}
