package main.java;

import java.util.LinkedList;
import java.util.List;

public class multiply43 {
    public static String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int c1 = num1.length();
        int c2 = num2.length();
        int[] sum = new int[c1 + c2];
        for (int i = c2 - 1; i >= 0; i--) {
            for (int j = c1 - 1; j >= 0; j--) {
                int count10 = c1-j-2+c2-i;
                int ta = sum[count10] + (num2.charAt(i) - '0') * ( num1.charAt(j) - '0');
                sum[count10] = ta % 10;
                sum[count10 + 1] = sum[count10 + 1] + ta / 10;
            }
        }
        StringBuilder s = new StringBuilder();
        int i = sum[c1 + c2 - 1] == 0 ? 1 : 0;
        int ind = 0;
        while (ind < c1 + c2 - i) {
            s.append(sum[ind]);
            ind++;
        }
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        multiply("9", "99");
    }
}
