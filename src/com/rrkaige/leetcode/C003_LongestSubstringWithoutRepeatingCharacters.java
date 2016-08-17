package com.rrkaige.leetcode;
/**
 * Example:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author kaneren
 *
 */
public class C003_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
    	if(s.matches("")) {
    		return 0;
    	}
        String res = "";
        res += s.charAt(0);
        int i = 0;
        for(int j = 1; j < s.length(); j++) {
        	for(int k = i; k < j; k++) {
        		if(s.charAt(k) == s.charAt(j)) {
        			if(res.length() < j - i) {
        				res = s.substring(i, j);
        			}
        			i = k + 1;
        		}
        	}
        }
		if(res.length() < s.length() - i) {
			res = s.substring(i);
		}
        return res.length();
    }
    
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(""));
	}
}
