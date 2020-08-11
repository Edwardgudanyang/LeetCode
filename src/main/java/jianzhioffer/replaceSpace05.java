package main.java.jianzhioffer;

public class replaceSpace05 {
    public String replaceSpace(String s) {
        StringBuffer r = new StringBuffer();
        int l = s.length();
        if (l == 0) {
            return s;
        }
        for (int i = 0; i < s.length();i++ ) {
            char t =s.charAt(i);
            if (t==' ') {
                r.append("%20");
            } else {
                r.append(t);
            }
        }
        return r.toString();
    }
}
