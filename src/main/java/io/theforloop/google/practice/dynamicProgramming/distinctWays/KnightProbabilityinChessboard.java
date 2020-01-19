package io.theforloop.google.practice.dynamicProgramming.distinctWays;

/**
 * @author Shubham
 */
/**
 *https://leetcode.com/problems/knight-probability-in-chessboard/
 * */
public class KnightProbabilityinChessboard {
    public double knightProbability(int N, int K, int r, int c) {
        int[] dr = new int[]{2, 2, 1, 1, -1, -1, -2, -2};
        int[] dc = new int[]{1, -1, 2, -2, 2, -2, 1, -1};
        double[][][] ways = new double[K+1][N][N];
        ways[0][r][c] = 1;
        for(int k=1; k<=K;++k){
            for(int i=0; i<N;++i){
                for(int j=0; j<N;++j){
                    for(int dir = 0;dir<8;dir++){
                        int oldR = i-dr[dir];
                        int oldC = j-dc[dir];
                        if(oldR>=0 && oldC>=0 && oldR<N && oldC<N){
                            ways[k][i][j]+=(ways[k-1][oldR][oldC]/8.0);
                        }
                    }
                }
            }
        }
        double ans = 0.0;
        for (double[] row: ways[K]) {
            for (double x: row) ans += x;
        }
        return ans;
    }
}
