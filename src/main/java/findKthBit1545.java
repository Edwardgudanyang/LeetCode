package main.java;

public class findKthBit1545 {
    public char findKthBit(int n, int k) {
        if (k == 1) {
            return '0';
        }
        int t = count(n);
        if (k == t) {
            return '1';
        }
        if (k == (t - 1) / 2 + 1) {
            return '1';
        } else if (k < (t - 1) / 2 + 1) {
            return findKthBit(n - 1, k);
        } else {
            char ta = findKthBit(n - 1, t - k + 1);
            if (ta == '1') {
                return '0';
            } else {
                return '1';
            }
        }
    }

    private int count(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * count(n - 1) + 1;
        }
    }
}
