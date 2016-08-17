package com.rrkaige.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * @author kaneren
 *
 */
public class A015_ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(len < 3) {
        	return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < len-2; i++) {
        	int j = i + 1;
        	int k = len -1;
        	while(j < k) {
        		if(nums[i] + nums[j] + nums[k] < 0) {
        			j++;
        		} else if(nums[i] + nums[j] + nums[k] > 0) {
        			k--;
        		} else {
        			res.add(Arrays.asList(nums[i],nums[j],nums[k]));
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
        	while(i < len-2 && nums[i] == nums[i+1]) {
        		i++;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		int[] nums = {0, 0, 0};
		System.out.println(threeSum(nums));
	}
}
