package com.juniors.leetcode.search;

/**
 * 二分查找
 *
 * @author Juniors
 * @date 2021/10/25 9:06
 */
public class BinarySearch {

    //1025
    public int search(int[] nums, int target) {

        if (target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        int low = 0, high = nums.length - 1;
        while (low <= high){
            //miss
            //int mid = (high - low) >> 1;
            int mid = low + (high - low) >> 1;
            if (target < nums[mid]){
                high = mid - 1;
            }else if (target == nums[mid]){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
