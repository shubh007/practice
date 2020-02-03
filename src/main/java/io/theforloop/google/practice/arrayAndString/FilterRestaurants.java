package io.theforloop.google.practice.arrayAndString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
* */
public class FilterRestaurants {
    class Res{
        int id;
        int rating;
        Res(int id,int rating){
            this.id = id;
            this.rating = rating;
        }
    }
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        int n = restaurants.length;
        if(n==0){
            return new ArrayList<>();
        }
        List<Res> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            boolean flag=true;
            if(veganFriendly == 1){
                flag = false;
            }
            if((flag || (restaurants[i][2] == veganFriendly)) && restaurants[i][3] <= maxPrice && restaurants[i][4] <=  maxDistance){
                result.add(new Res(restaurants[i][0],restaurants[i][1]));
            }
        }
        List<Integer> filteredRest = result.stream()
                // .filter(c -> c.data.contains(2))
                .sorted((a, b) -> {
                    int t = b.rating - a.rating;
                    if(t==0){
                        return b.id - a.id;
                    }
                    return t;
                } )
                .map(c -> c.id)
                .collect(Collectors.toList());
        return filteredRest;
    }
}
