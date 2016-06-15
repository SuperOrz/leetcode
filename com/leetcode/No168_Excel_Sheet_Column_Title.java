/**
 * Copyright 2014-2015, NetEase, Inc. All Rights Reserved.
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
public class No168_Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
        n = n - 1;
        StringBuilder sb = new StringBuilder();
        if (n >= 26) {
            sb.append(convertToTitle(n / 26)).append((char) (n % 26 + 'A'));
        } else {
            sb.append((char) ('A' + n));
        }
        return sb.toString();
    }
}
