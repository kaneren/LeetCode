package com.rrkaige.leetcode;
/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author kaneren
 *
 */
public class H009_PalindromeNumber {
    public static boolean isPalindrome(int x) {
    	if(x == 0) {
    		return true;
    	}
    	if(x < 0 || x % 10 == 0) {
    		return false;
    	}
        int a = 0;
        while(a <= x) {
        	int b = x;
        	a = a *10 + x % 10;
        	x /= 10;
        	if(a == x || a == b) {
        		return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		System.out.println(isPalindrome(120));
	}
}
