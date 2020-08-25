package main.java.jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

public class reverseLeftWords58 {
    public String reverseLeftWords(String s, int n) {
        Queue<Character> q= new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            char a=q.remove();
            q.add(a);
        }
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(q.remove());
        }
        return res.toString();
    }
}
