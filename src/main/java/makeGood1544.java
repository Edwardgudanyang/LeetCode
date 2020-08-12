package main.java;

public class makeGood1544 {
    public String makeGood(String s) {
        int n=s.length();
        StringBuilder a=new StringBuilder();
        a.append(s);
        if(n<=1){
            return s;
        }
        int i=0;
        while(i<a.length()-1){
            if(Math.abs(a.charAt(i)-a.charAt(i+1))==32){
                a.delete(i,i+2);
            }else
            i++;
        }
        return a.toString();
    }
}
