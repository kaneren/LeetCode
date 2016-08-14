package com.rrkaige.leetcode;
/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author kaneren
 *
 */
public class PalindromeNumber2 {
    public static boolean isPalindrome(int x) {
    	if(x == 0) {
    		return true;
    	}
    	if(x < 0) {
    		return false;
    	}
        long xx = x;
        long a = 0;
        while(xx > 0) {
            a = a * 10 + xx % 10;
            xx /= 10;
        }
        return a == x;
    }

	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));
	}
}
