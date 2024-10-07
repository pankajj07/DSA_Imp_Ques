package com.leetcode;

public class MergeSortedArray {
	public static void main(String[] args) {
		
		 MergeSortedArray msa = new MergeSortedArray();

	        // Define the arrays and the lengths
	        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has enough space for nums2
	        int m = 3;  // Number of initialized elements in nums1
	        int[] nums2 = {2, 5, 6};
	        int n = 3;  // Number of elements in nums2

	        // Call the merge method
	        msa.merge(nums1, m, nums2, n);

	        // Print the merged array
	        System.out.println("Merged array: ");
	        for (int num : nums1) {
	            System.out.print(num + " ");
	        }
		
	}
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	    int r1 = m - 1;  // Last initialized element in nums1
	    int r2 = n - 1;  // Last element in nums2
	    int w = m + n - 1;  // Write index, starting from the end of nums1

	    // Merge nums2 into nums1 from the end of both arrays
	    while (r2 >= 0) {
	        if (r1 >= 0 && nums1[r1] > nums2[r2]) {
	            nums1[w--] = nums1[r1--];  // Place larger element in nums1
	        } else {
	            nums1[w--] = nums2[r2--];  // Place element from nums2
	        }
	    }
	}
	
	

}
