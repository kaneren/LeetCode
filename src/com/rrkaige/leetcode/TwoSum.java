package com.rrkaige.leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author kaneren
 *
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length-1; i++){
        	for(int j = i+1; j < nums.length; j++){
        		if(nums[i] + nums[j] == target){
        			res[0] = i;
        			res[1] = j;
            		return res;
        		}
        	}
        }
		return res;
    }
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        
    	int[] res = twoSum(nums, target);
    	System.out.println(Arrays.toString(res));
    }
}