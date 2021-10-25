package com.juniors.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Juniors
 * @date 2021/10/23 15:30
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.get(target - nums[i]) != null){
                return new int[] {i,map.get(target - nums[i])};
            }

            map.put(nums[i],i);
        }

        return new int[] {};
    }

    //10.24
    public int[] twoSum1(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null){
                return new int[] {map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
















}
