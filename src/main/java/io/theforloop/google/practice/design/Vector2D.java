package io.theforloop.google.practice.design;

public class Vector2D {
    private int[][] data;
    private int row,col;
    private int noOfRows;
    private int currNoOfCols;
    public Vector2D(int[][] v) {
        data = v;
        row = 0;
        col = 0;
        noOfRows = data.length;
        currNoOfCols = 0;
        while(noOfRows>0 && row < noOfRows && data[row].length==0){
            row++;
        }
        if(row < noOfRows){
            currNoOfCols = data[row].length;
        }
    }

    public int next() {
        if(col == currNoOfCols-1){
            int d = data[row][col];
            col = 0;
            currNoOfCols = 0;
            row++;
            while(noOfRows>0 && row < noOfRows && data[row].length==0) {
                row++;
            }
            if(row < noOfRows){
                currNoOfCols = data[row].length;
            }
            return d;
        }else{
            return data[row][col++];
        }
    }

    public boolean hasNext() {
        return noOfRows>0 && row <= noOfRows-1 && currNoOfCols>0 && col <= currNoOfCols-1;
    }

}
