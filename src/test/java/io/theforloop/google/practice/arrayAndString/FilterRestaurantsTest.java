package io.theforloop.google.practice.arrayAndString;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class FilterRestaurantsTest {

    @Test
    public void filterRestaurants1() {
        int[][] restaurants = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 1, maxPrice = 50, maxDistance = 10;
        Integer[] exp = {3,1,5};
        List<Integer> expList = new ArrayList<>(Arrays.asList(exp));
        FilterRestaurants filterRestaurants = new FilterRestaurants();
        List<Integer> res = filterRestaurants.filterRestaurants(restaurants,veganFriendly,maxPrice,maxDistance);
        Assert.assertEquals(expList.size(),res.size());
        for(int i = 0 ; i < expList.size() ; i++){
            Assert.assertEquals(expList.get(i),res.get(i));
        }
    }
    @Test
    public void filterRestaurants2() {
        int[][] restaurants = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 0, maxPrice = 50, maxDistance = 10;
        Integer[] exp = {4,3,2,1,5};
        List<Integer> expList = new ArrayList<>(Arrays.asList(exp));
        FilterRestaurants filterRestaurants = new FilterRestaurants();
        List<Integer> res = filterRestaurants.filterRestaurants(restaurants,veganFriendly,maxPrice,maxDistance);
        Assert.assertEquals(expList.size(),res.size());
        for(int i = 0 ; i < expList.size() ; i++){
            Assert.assertEquals(expList.get(i),res.get(i));
        }
    }
    @Test
    public void filterRestaurants3() {
        int[][] restaurants = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 0, maxPrice = 30, maxDistance = 3;
        Integer[] exp = {4,5};
        List<Integer> expList = new ArrayList<>(Arrays.asList(exp));
        FilterRestaurants filterRestaurants = new FilterRestaurants();
        List<Integer> res = filterRestaurants.filterRestaurants(restaurants,veganFriendly,maxPrice,maxDistance);
        Assert.assertEquals(expList.size(),res.size());
        for(int i = 0 ; i < expList.size() ; i++){
            Assert.assertEquals(expList.get(i),res.get(i));
        }
    }
}