package com.rrkaige.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 * @author kaneren
 *
 */
public class A018_FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(len < 4) {
        	return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < len-3; i++) {
        	for(int l = len-1; i < l-2; l--) {
        		int j = i + 1;
        		int k = l - 1;
        		while(j < k) {
        			if(nums[i] + nums[j] + nums[k] + nums[l] < target) {
        				j++;
        			} else if(nums[i] + nums[j] + nums[k] + nums[l] > target) {
        				k--;
        			} else {
        				res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
        				j++;
        				k--;
        				while(j < k && nums[j] == nums[j-1]) {
        					j++;
        				}
        				while(j < k && nums[k] == nums[k+1]) {
        					k--;
        				}
        			}
        		}
        		while(i < l-2 && nums[l] == nums[l-1]) {
        			l--;
        		}
        	}
        	while(i < len-3 && nums[i] == nums[i+1]) {
        		i++;
        	}
        }
        return res;
    }
    
	public static void main(String[] args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		System.out.println(fourSum(nums, target));
	}
}
