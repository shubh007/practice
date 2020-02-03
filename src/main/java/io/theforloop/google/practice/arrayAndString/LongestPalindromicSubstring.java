package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return s ;
        }
        int len = s.length();
        boolean[][] res = new boolean[len][len];
        for(int i = 0 ; i < len ; i++){
            res[i][i] = true;
        }
        int max = 1;
        int[] indx = new int[2];
        for(int i = 1 ; i < len ; i++){
            for(int j = 0 ; j < len-i ; j++){
                int k = j+i;
                if(s.charAt(j) == s.charAt(k)){
                    int m = k-j+1;
                    if(m==2){
                        res[j][k] = true;
                    }else{
                        res[j][k] =  res[j+1][k-1] ;
                    }
                    if(res[j][k] && m>max){
                        max = m ;
                        indx[0] = j;
                        indx[1] = k;
                    }
                }
            }
        }
        return s.substring(indx[0],indx[1]+1);
    }
}
