package io.theforloop.google.practice.sortingSearching;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shubham
 */
public class MeetingRoomsIITest {

    @Test
    public void minMeetingRooms1() {
        int[][] intervals = {{0, 30},{5, 10},{15, 20}};
        int exp = 2;
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int res = meetingRoomsII.minMeetingRooms(intervals);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void minMeetingRooms2() {
        int[][] intervals = {{7,10},{2,4}};
        int exp = 1;
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int res = meetingRoomsII.minMeetingRooms(intervals);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void minMeetingRooms3() {
        int[][] intervals = {{9,10},{4,9},{4,17}};
        int exp = 2;
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int res = meetingRoomsII.minMeetingRooms(intervals);
        Assert.assertEquals(exp,res);
    }
    @Test
    public void minMeetingRooms4() {
        int[][] intervals = {{2,11},{6,16},{11,16}};
        int exp = 2;
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int res = meetingRoomsII.minMeetingRooms(intervals);
        Assert.assertEquals(exp,res);
    }
}