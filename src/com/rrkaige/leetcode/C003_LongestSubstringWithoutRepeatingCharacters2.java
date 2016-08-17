package com.rrkaige.leetcode;
/**
 * Example:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author kaneren
 *
 */
public class C003_LongestSubstringWithoutRepeatingCharacters2 {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        int prev[] = new int[300];
        for(int i = 0; i < 300; i++) {
        	prev[i] = -1;
        }
        for(int i = 0; i < s.length(); i++) {
            if(prev[s.charAt(i)] >= left)
                left = prev[s.charAt(i)] + 1;
            prev[s.charAt(i)] = i;
            if(res < i - left + 1) {
            	res = i - left + 1;
            }
        }
        return res;
    }
    
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(""));
	}
}
