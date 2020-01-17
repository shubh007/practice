package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
*
* */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--){
            int temp = digits[i]+carry;
            carry = temp/10;
            digits[i] = temp%10;
        }
        if(carry == 1){
            int[] narr = new int[digits.length+1];
            narr[0] = carry;
            for(int i=0;i<digits.length;i++){
                narr[i+1] = digits[i];
            }
            return narr;
        }
        return digits;
    }
}
