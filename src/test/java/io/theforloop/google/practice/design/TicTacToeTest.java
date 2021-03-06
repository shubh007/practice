package io.theforloop.google.practice.design;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void ticTacToeTest() {
        TicTacToe ticTacToe = new TicTacToe(3);
        Assert.assertEquals(0,ticTacToe.move(0,0,1));
        Assert.assertEquals(0,ticTacToe.move(0,2,2));
        Assert.assertEquals(0,ticTacToe.move(2,2,1));
        Assert.assertEquals(0,ticTacToe.move(1,1,2));
        Assert.assertEquals(0,ticTacToe.move(2,0,1));
        Assert.assertEquals(0,ticTacToe.move(1,0,2));
        Assert.assertEquals(1,ticTacToe.move(2,1,1));
    }
}