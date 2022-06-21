package com.company;

public class Main {
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] sums = new int[0];
        int i = nums.length;
        while(i<= nums.length){
            if (nums[i - 1] + nums[i - 2] == target){
                sums[0] = nums[i-1];
                sums[1] = nums[i-2];
                i--;

            }
        }
        return sums;
    }
}
