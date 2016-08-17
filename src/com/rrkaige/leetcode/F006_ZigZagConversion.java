package com.rrkaige.leetcode;
/**
 * Example:
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR"
 * @author kaneren
 *
 */
public class F006_ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(numRows == 1) {
        	return s;
        }
    	String res = "";
        int len = s.length();
        int step = numRows * 2 - 2;
        for(int i = 0; i < len; i += step) {
        	res += s.charAt(i);
        }
        for(int i = 1; i < numRows-1; i++) {
        	for(int j = i; j < len; j += step) {
        		res += s.charAt(j);
        		if(j+step-i*2 < len) {
        			res += s.charAt(j+step-i*2);
        		}
        	}
        }
        for(int i = numRows-1; i < len; i += step) {
        	res += s.charAt(i);
        }
        return res;
    }

	public static void main(String[] args) {
		String res = convert("PAYPALISHIRING", 3);
		System.out.println(res);
	}
}
