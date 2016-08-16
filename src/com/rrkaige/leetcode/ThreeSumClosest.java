package com.rrkaige.leetcode;

import java.util.Arrays;

/**
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * @author kaneren
 *
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[len-1];
        int t = Math.abs(res - target);
        for(int i = 0; i < len-2; i++) {
        	int j = i + 1;
        	int k = len - 1;
        	while(j < k) {
        		if(Math.abs(nums[i] + nums[j] + nums[k] - target) < t) {
        			res = nums[i] + nums[j] + nums[k];
        			t = Math.abs(res - target);
        		}
        		if(nums[i] + nums[j] + nums[k] < target) {
        			j++;
        		} else if(nums[i] + nums[j] + nums[k] > target) {
        			k--;
        		} else {
        			res = nums[i] + nums[j] + nums[k];
        			break;
        		}
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		System.out.println(threeSumClosest(nums, target));
	}
}
