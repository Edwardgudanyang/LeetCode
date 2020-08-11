package main.java;

public class countBinarySubstrings696 {
    public int countBinarySubstrings(String s) {
        char[] c = s.toCharArray();
        char pC = c[0];
        int count = 0;
        int c0 = 0, c1 = 0;
        for (int i = 0; i < c.length; i++) {
            if (pC == c[i] && c[i] == '0') {
                c0++;
            }
            if (pC == c[i] && c[i] == '1') {
                c1++;
            }
            if (pC != c[i] && c[i] == '1') {
                c1=1;
            }
            if (pC != c[i] && c[i] == '0') {
                c0=1;
            }
            if(c0==c1 && c0!=0){
                count+=c1;
            }else if (pC != c[i] && c[i] == '1' && c0>=1) {
                    count++;

            }else if (pC != c[i] && c[i] == '0' && c1>=1) {
                    count++;
            }
            pC=c[i];
        }
        return count;

    }
}
