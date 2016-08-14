package com.rrkaige.leetcode;
/**
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * @author kaneren
 *
 */
public class ReverseInteger {
    public static int reverse(int x) {
    	if(x == 0 || x == Integer.MIN_VALUE) {
    		return 0;
    	}
    	if(x < 0) {
    		return -reverse(-x);
    	}
    	int res = 0;
    	while(x != 0) {
    		if(res > (Integer.MAX_VALUE - x % 10) / 10) {
    			return 0;
    		}
    		res = res * 10 + x % 10;
    		x /= 10;
    	}
    	return res;
    }
    
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
}
