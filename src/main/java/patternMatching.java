package main.java;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Objects;

/**
 * 你有两个字符串，即pattern和value。 pattern字符串由字母"a"和"b"组成，用于描述字符串中的模式。例如，字符串"catcatgocatgo"匹配模式"aabab"（其中"cat"是"a"，"go"是"b"），该字符串也匹配像"a"、"ab"和"b"这样的模式。但需注意"a"和"b"不能同时表示相同的字符串。编写一个方法判断value字符串是否匹配pattern字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入： pattern = "abba", value = "dogcatcatdog"
 * 输出： true
 * 示例 2：
 * <p>
 * 输入： pattern = "abba", value = "dogcatcatfish"
 * 输出： false
 * 示例 3：
 * <p>
 * 输入： pattern = "aaaa", value = "dogcatcatdog"
 * 输出： false
 * 示例 4：
 * <p>
 * 输入： pattern = "abba", value = "dogdogdogdog"
 * 输出： true
 * 解释： "a"="dogdog",b=""，反之也符合规则
 * 提示：
 * <p>
 * 0 <= len(pattern) <= 1000
 * 0 <= len(value) <= 1000
 * 你可以假设pattern只包含字母"a"和"b"，value仅包含小写字母。
 */
public class patternMatching {
    public static boolean patternMatching(String pattern, String value) {
        String s[] = new String[2];
        return solve(s, pattern, 0, value, 0);
    }

    /**
     * 回溯遍历设置a,b的对应值，尝试每一种可能。
     *
     * @param s       s[0]=a对应的字符串 s[1]=b对应的字符串
     * @param pattern 模式串
     * @param index1  模式串匹配位置
     * @param value   匹配串（待匹配的字符串）
     * @param index2  匹配串匹配位置
     * @return
     */
    public static boolean solve(String[] s, String pattern, int index1, String value, int index2) {
        //匹配完成
        if (index1 == pattern.length() && index2 == value.length()) {
            return true;
        }
        //注意匹配串匹配位置等于长度的时候也可以继续匹配，因为模式串的a，b可以匹配空串。
        if (index1 >= pattern.length() || index2 > value.length()) {
            return false;
        }
        int num = pattern.charAt(index1) - 'a';
        if (Objects.isNull(s[num])) {
            for (int i = index2; i <= value.length(); i++) {
                s[num] = value.substring(index2, i);
                if ( !s[num].equals(s[num ^ 1]) && solve(s, pattern, index1 + 1, value, i)) {
                    return true;
                }
            }
            s[num] = null;
            return false;
        } else {
            int end=index2+s[num].length();
            if(end> value.length()||!value.substring(index2,end).equals(s[num])) return false;
            return solve(s,pattern,index1+1,value,end);
        }
    }


    public static  void main(String args[]){
        patternMatching("abba", "dogcatcatfish");
    }
}
