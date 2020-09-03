package main.java.jianzhioffer;

public class movingCount13 {
    public int movingCount(int m, int n, int k) {
        int[][] a=new int[m][n];
        return solve(0,0,a,k);
    }

    int solve(int i,int j,int[][] a,int k){
        if(i<0 || j<0 || i>=a.length || j>=a[0].length || sum(i,j)>k  || a[i][j]==1){
            return 0;
        }
        a[i][j]=1;
        return 1+solve(i+1,j,a,k)+solve(i,j+1,a,k);
    }

    private int sum(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }

}
