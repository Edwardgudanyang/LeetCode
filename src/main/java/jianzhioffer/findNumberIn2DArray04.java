package main.java.jianzhioffer;

public class findNumberIn2DArray04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int c = matrix[0].length;
        int h = matrix.length;
        if (matrix.length == 0 || matrix == null || matrix[0].length == 0) {
            return false;
        }
        int a=0;int b=c-1;
        while(a<h && b>=0){
            int t=matrix[a][b];
            if(t==target){
                return true;
            }
            else if(t>target){
                b--;
            }
            else if(t<target){
                a++;
            }
        }
        return false;
    }
}
