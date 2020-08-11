package main.java;

public class alphabetBoardPath1138 {
    public static String alphabetBoardPath(String target) {
        StringBuffer res = new StringBuffer();
        int len = target.length();
        int[][] a = new int[2][2];
        a[0][0] = 0;
        a[0][1] = 0;
        for (int i = 0; i < len; i++) {
            a[1][0] = (target.charAt(i) - 'a') / 5;
            a[1][1] = (target.charAt(i) - 'a') % 5;
            while (a[0][0] != a[1][0] || a[0][1] != a[1][1]) {
                while (a[0][0] != a[1][0]) {
                    if (a[0][0] < a[1][0]   && !(a[0][0]==4 && a[0][1]>0)) {
                        res.append("D");
                        a[0][0]++;
                    } else if (a[0][0] > a[1][0]) {
                        res.append("U");
                        a[0][0]--;
                    }
                    if(a[0][0] < a[1][0]   && (a[0][0]==4 && a[0][1]>0)){
                        break;
                    }
                }
                while (a[0][1] != a[1][1]  && a[0][0]!=5) {
                    if (a[0][1] < a[1][1] && a[0][0]!=5) {
                        res.append("R");
                        a[0][1]++;
                    } else if (a[0][1] > a[1][1]) {
                        res.append("L");
                        a[0][1]--;
                    }
                }
            }
            res.append("!");
        }
        return res.toString();
    }

    public static  void main(String args[]){
        alphabetBoardPath("grfgruuzjrktmqkziczvhezkpjzzxrdofdsksssvqoqpvwybrfigkfekcuzqdopwkgwtajelpkpxymvzikrcyoglzejtgsgzstun");
    }

}
