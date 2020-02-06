package io.theforloop.google.practice.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
    private Map<Integer,Integer> map ;
    private List<Integer> list ;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int key) {
        if(map.containsKey(key)){
            return false;
        }
        map.put(key,list.size());
        list.add(key);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int key) {
        if(map.containsKey(key)){
            int val = map.get(key);
            map.remove(key);
            if(list.get(list.size()-1) == key){
                list.remove(list.size() - 1);
            }else {
                list.set(val, list.get(list.size() - 1));
                list.remove(list.size() - 1);
                map.put(list.get(val), val);
            }
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if(list.isEmpty()){
            return -1;
        }
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }

}
