package com.leetcode;

import java.util.*;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1};
		
		
		System.out.println(containsNearbyDuplicate(a, 4));
		
	}	


public static boolean containsNearbyDuplicate(int[] nums, int k) {
	
	
	//****Method Second less Space complexity & TC O(n)*****
	Set<Integer> set = new HashSet();
	for(int i = 0; i < nums.length; i++) {
		if(set.contains(nums[i])) {
			return true;
		}
		set.add(nums[i]);
		if(set.size() > k) {
			set.remove(nums[i - k]);
		}
	
	
	
}
	return false;


	

	
	//****Method First more Space complexity & TC O(n)*****
	
//    Map<Integer, Integer> map = new HashMap();
//    int idx = 0;
//    for(int i: nums){
//        if(map.containsKey(i) && Math.abs(idx - map.get(i)) <= k){
//            return true;
//        }else{
//        map.put(i, idx);
//        }
//        idx++;
//    }
//    return false;
    
}
}
