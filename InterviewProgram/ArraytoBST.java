package com.leetcode;

import java.util.ArrayList;
import java.util.List;

class ArraytoBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return constructBST(nums, 0, nums.length - 1);
    }
    
    //constructor
    private TreeNode constructBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = constructBST(nums, left, mid - 1);
        root.right = constructBST(nums, mid + 1, right);
        
        return root;
    }

    public void inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        System.out.println(result);
    }

    private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderTraversalHelper(node.left, result);
        result.add(node.val);
        inorderTraversalHelper(node.right, result);
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        ArraytoBST ats = new ArraytoBST();
        TreeNode root = ats.sortedArrayToBST(nums);
        
        System.out.println("Inorder Traversal of the constructed BST:");
        ats.inorderTraversal(root);
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}



