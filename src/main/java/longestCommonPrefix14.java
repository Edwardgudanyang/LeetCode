package main.java;

public class longestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        int min=Integer.MAX_VALUE;
        if(len==0){
            return "";
        }
        for(int i=0;i<len;i++){
            min=Math.min(min,strs[i].length());
        }
        if(min==0){
            return "";
        }
        for(int i=min;i>0;i--){
            String t=strs[0].substring(0,i);
            int a=1;
            for(int j=0;j<len;j++){
                String t1=strs[j].substring(0,i);
                if(!t.equals(t1)){
                    a=0;
                    break;
                }
            }
            if(a==1){return t;}
        }
        return "";

    }
}
