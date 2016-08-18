package com.rrkaige.leetcode;
/**
 * Example 1:
 * nums1 = [1, 3],nums2 = [2],The median is 2.0
 * Example 2:
 * nums1 = [1, 2],nums2 = [3, 4],The median is (2 + 3)/2 = 2.5
 * @author kaneren
 *
 */
public class D004_MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if((m + n) % 2 == 1) {
        	return findKthSortedArrays(nums1, 0, m, nums2, 0, n, (m + n) / 2 +1);
        } else {
        	return (findKthSortedArrays(nums1, 0, m, nums2, 0, n, (m + n) / 2 +1) +
        			findKthSortedArrays(nums1, 0, m, nums2, 0, n, (m + n) / 2)) / 2.0;
        }
    }
    
    public static double findKthSortedArrays(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
    	int m = end1 - start1;
    	int n = end2 - start2;
    	if(m < n) {
    		return findKthSortedArrays(nums2, start2, end2, nums1, start1, end1, k);
    	}
    	if(n == 0) {
    		return nums1[start1 + k -1];
    	}
    	if(k == 1) {
    		return Math.min(nums1[start1], nums2[start2]);
    	}
    	
    	int p2 = Math.min(k / 2, n);
    	int p1 = k - p2;
    	if(nums1[start1 + p1 -1] < nums2[start2 + p2 -1]) {
    		return findKthSortedArrays(nums1, start1 + p1, end1, nums2, start2, end2, k - p1);
    	} else if(nums1[start1 + p1 -1] > nums2[start2 + p2 -1]) {
    		return findKthSortedArrays(nums1, start1, end1, nums2, start2 + p2, end2, k - p2);
    	} else {
    		return nums1[start1 + p1 -1];
    	}
    }
    
	public static void main(String[] args) {
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
