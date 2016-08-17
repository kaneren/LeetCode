package com.rrkaige.leetcode;
/**
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * @author kaneren
 *
 */
public class G065_ValidNumber {
    public static boolean isNumber(String s) {
        String regex = "[+-]?(\\d+\\.?|\\.\\d+)\\d*(e[+-]?\\d+)?";
        if(s.trim().matches(regex)) {
        	return true;
        } else {
        	return false;
        }
    }
    
	public static void main(String[] args) {
		System.out.println(isNumber("0"));
	}
}
