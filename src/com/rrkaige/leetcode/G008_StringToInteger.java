package com.rrkaige.leetcode;
/**
 * Implement atoi to convert a string to an integer
 * @author kaneren
 *
 */
public class G008_StringToInteger {
    public static int myAtoi(String str) {
        int len = str.length();
        int i = 0;
        int sign = 1;
        while(i < len && (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')) {
        	i++;
        }
        if(i == len) {
        	return 0;
        }
        
        if(str.charAt(i) == '+') {
        	i++;
        } else if(str.charAt(i) == '-') {
        	i++;
        	sign = -1;
        }
        
        int res = 0;
        boolean overflow = false;
        while(i < len) {
        	if(str.charAt(i) < '0' || str.charAt(i) > '9') {
        		break;
        	}
        	if((sign == 1 && res > (Integer.MAX_VALUE - (str.charAt(i) - '0')) / 10) ||
        			(sign == -1 && -res < (Integer.MIN_VALUE + (str.charAt(i) - '0')) / 10)) {
        		overflow = true;
        		break;
        	}
        	res = res * 10 + (str.charAt(i) - '0');
        	i++;
        }
        if(overflow) {
        	res = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
        	res *= sign;
        }
        return res;
    }
    
	public static void main(String[] args) {
		System.out.println(myAtoi("-2147483649"));
	}
}
