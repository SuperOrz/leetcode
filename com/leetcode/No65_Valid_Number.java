/**
 * 
 * Date: 2016年6月15日
 */
package com.leetcode;

/**
 * TODO
 *
 * @author name<mail>
 * @since 2016年6月15日
 */
public class No65_Valid_Number {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.startsWith("-")) {
            s = s.substring(1);
        } else if (s.startsWith("+")) {
            s = s.substring(1);
        }
        if (s.contains("e")) {
            int index = s.indexOf("e");
            if (index == s.length() - 1)
                return false;
            else
                return isLegal1(s.substring(0, index)) && isLegal3(s.substring(index + 1));
        } else if (s.contains(".")) {
            return isLegal1(s);
        }
        return isLegal2(s);
    }

    private boolean isLegal1(String s) {
        if (s.contains(".")) {
            int index = s.indexOf(".");
            if (index == s.length() - 1)
                return isLegal2(s.substring(0, index));
            else if (index == 0)
                return isLegal2(s.substring(index + 1));
            else
                return isLegal2(s.substring(index + 1)) && isLegal2(s.substring(0, index));
        } else {
            return isLegal2(s);
        }
    }

    private boolean isLegal2(String s) {
        if (!s.matches("\\d+"))
            return false;
        else
            return true;
    }

    private boolean isLegal3(String s) {
        if (s.startsWith("+") || s.startsWith("-"))
            s = s.substring(1);
        if (!s.matches("\\d+"))
            return false;
        else
            return true;
    }
}
