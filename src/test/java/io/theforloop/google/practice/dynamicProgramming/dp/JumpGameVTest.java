package io.theforloop.google.practice.dynamicProgramming.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class JumpGameVTest {

    @Test
    public void maxJumps1() {
        int[] arr = {6,4,14,6,8,13,9,7,10,6,12};
        int d = 2;
        int exp = 4;
        JumpGameV jumpGameV = new JumpGameV();
        int res =  jumpGameV.maxJumps(arr,d);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void maxJumps2() {
        int[] arr = {3,3,3,3,3};
        int d = 3;
        int exp = 1;
        JumpGameV jumpGameV = new JumpGameV();
        int res =  jumpGameV.maxJumps(arr,d);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void maxJumps3() {
        int[] arr = {7,6,5,4,3,2,1};
        int d = 1;
        int exp = 7;
        JumpGameV jumpGameV = new JumpGameV();
        int res =  jumpGameV.maxJumps(arr,d);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void maxJumps4() {
        int[] arr = {7,1,7,1,7,1};
        int d = 2;
        int exp = 2;
        JumpGameV jumpGameV = new JumpGameV();
        int res =  jumpGameV.maxJumps(arr,d);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void maxJumps5() {
        int[] arr = {66};
        int d = 1;
        int exp = 1;
        JumpGameV jumpGameV = new JumpGameV();
        int res =  jumpGameV.maxJumps(arr,d);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void maxJumps6() {
        int[] arr = {77,188,2032,2367,2523,3851,4042,5757,6469,8008,8711,9712,10063,10105,10938,11274,11807,12115,12438
                ,12469,14294,14342,15559,15689,16105,16201,16255,17396,17403,18264,18268,19540,19739,19873,19890,20075
                ,20568,20872,21531,22051,22204,22766,23309,26244,26921,28641,29868,30484,30512,30624,31141,31333,31939
                ,32276,32590,33689,33783,34834,34842,35537,35617,35735,36470,36964,38694,39168,39324,39662,41110,41642
                ,41688,42468,42528,43412,43715,43732,44069,44299,44638,47261,47659,47765,48186,49214,49575,50081,51085
                ,52475,54409,55034,56826,57139,58247,59723,59853,60029,60195,60654,61286,62382,63177,63612,63893,64131
                ,65565,67433,67584,69357,69536,71358,71590,71638,74420,74922,74952,75937,76106,76747,78064,78268,78572
                ,78633,78797,79018,79724,79997,81236,81527,83241,85818,88201,88358,88531,89596,90409,90592,91000,91609
                ,91682,91725,92584,92612,92794,92986,93776,94062,94583,95954,96128,96778,97077,99427};
        int d = 34;
        int exp = 1;
        JumpGameV jumpGameV = new JumpGameV();
        int res =  jumpGameV.maxJumps(arr,d);
        Assert.assertEquals(exp,res);
    }
}