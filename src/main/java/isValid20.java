package main.java;

import java.util.Stack;

public class isValid20 {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack();
        if(s.length()==0){
            return true;
        }
        if(s.length()%2==1){
            return false;
        }
        if (')' == s.charAt(0) || ']' == s.charAt(0) || '}' == s.charAt(0)) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)) {
                a.push(s.charAt(i));
                return false;
            }
            if (')' == s.charAt(i)) {
                if(a.pop()!='('){
                    return false;
                }
            }
            if (']' == s.charAt(i)) {
                if(a.pop()!='['){
                    return false;
                }
            }
            if ('}' == s.charAt(i)) {
                if(a.pop()!='{'){
                    return false;
                }
            }
        }
        if(a.size()>0){
            return false;
        }
        return true;
    }
}
