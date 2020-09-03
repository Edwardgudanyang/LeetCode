package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class solveNQueens51 {
    public List<List<String>> solveNQueens(int n) {
        char[][] res = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = '.';
            }
        }
        List<List<String>> resArray = new LinkedList<>();
        solve(resArray, res, 0);
        return resArray;

    }

    private void solve(List<List<String>> resArray, char[][] res, int rownum) {
        if (rownum == res.length) {
            resArray.add(construct(res));
            return;
        }
        for (int i = 0; i < res.length; i++) {
            if (valid(res, rownum, i)) {
                res[rownum][i] = 'Q';
                solve(resArray, res, rownum + 1);
                res[rownum][i] = '.';
            }
        }
    }

    private boolean valid(char[][] res, int rownum, int p) {
        if (rownum == 0) {
            return true;
        } else {
            for (int i = 0; i < rownum ; i++) {
                if (res[i][p] == 'Q') {
                    return false;
                }
            }
            for (int i = rownum - 1, j = p + 1; i >= 0 && j < res.length; i--, j++) {
                if (res[i][j] == 'Q') {
                    return false;
                }
            }
            //判断当前坐标的左上角有没有皇后
            for (int i = rownum - 1, j = p - 1; i >= 0 && j >= 0; i--, j--) {
                if (res[i][j] == 'Q') {
                    return false;
                }
            }

        }
        return true;
    }

    //把数组转为list
    private List<String> construct(char[][] chess) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < chess.length; i++) {
            path.add(new String(chess[i]));
        }
        return path;
    }

}
