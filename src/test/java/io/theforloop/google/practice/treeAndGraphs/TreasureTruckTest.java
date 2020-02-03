package io.theforloop.google.practice.treeAndGraphs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TreasureTruckTest {

    @Test
    public void numberAmazonTreasureTrucks() {
        Integer[][] input = {{1,1,0,0},
                            {0,0,1,0},
                            {0,0,0,0},
                            {1,0,1,1},
                            {1,1,1,1}};
        int rows = 5 ;
        int columns = 4;
        int exp = 3 ;
        List<List<Integer>> grid = new ArrayList<>();
        for(int i = 0 ; i < rows ; i++){
            grid.add(new ArrayList<>(Arrays.asList(input[i])));
        }
        TreasureTruck treasureTruck = new TreasureTruck();
        int res = treasureTruck.numberAmazonTreasureTrucks(rows,columns,grid);
        Assert.assertEquals(exp,res);
    }
}