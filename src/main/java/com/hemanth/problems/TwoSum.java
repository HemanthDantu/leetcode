package com.hemanth.problems;

import java.util.HashMap;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            if(nums.length==0){
                return result;
            }
            HashMap<Integer,Integer> mapp = new HashMap<>();

            for(int i =0; i<nums.length; i++){
                mapp.put(nums[i],i);
            }
            for(int i =0; i<nums.length; i++){
                if(mapp.containsKey(target-nums[i]) && i!= mapp.get(target-nums[i])){
                    return new int[]{i, mapp.get(target-nums[i])};
                }
            }
            return result;
        }
    }
}
