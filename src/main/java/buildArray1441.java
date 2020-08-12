package main.java;

import java.util.LinkedList;
import java.util.List;

public class buildArray1441 {
    public List<String> buildArray(int[] target, int n) {
        int a = target.length;
        List<String> s = new LinkedList<>();
        int q=0;
        for(int i=1;i<=n;i++){
            if(i==target[q]){
                s.add("Push");
                q++;
                if(q==a){
                    break;
                }
            }else{
                s.add("Push");
                s.add("Pop");
            }
        }
        return s;
    }
}
