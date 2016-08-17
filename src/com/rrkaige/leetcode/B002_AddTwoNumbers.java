package com.rrkaige.leetcode;
/**
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * @author kaneren
 *
 */
public class B002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int sum = 0;
        while(true) {
        	if(l1 != null) {
        		sum += l1.val;
        		l1 = l1.next;
        	}
        	if(l2 != null) {
        		sum += l2.val;
        		l2 = l2.next;
        	}
        	cur.val = sum % 10;
        	sum = sum / 10;
        	if(l1 != null || l2 != null || sum != 0) {
        		cur.next = new ListNode(0);
        		cur = cur.next;
        	}else {
        		break;
        	}
        }
        return res;
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) {
    		val = x;
    		next = null;
    	}
    } 
    
	public static void main(String[] args) {
    	System.out.println("Not test case");
	}
}
