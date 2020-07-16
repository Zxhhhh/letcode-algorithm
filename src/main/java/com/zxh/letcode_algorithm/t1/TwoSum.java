package com.zxh.letcode_algorithm.t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;


/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

 * @author zhuxianhao
 *
 */
class TwoSum {
	
	public static void main(String[] args) throws Exception {
		int[] result = twoSum(new int[]{2, 7,11,15},26);
		System.out.println(Arrays.toString(result));
	}
	
    public static int[] twoSum(int[] nums, int target) throws Exception {
    	
    	return sol2(nums, target);
    }
    
    /**
     * 暴力解决法 ，两次遍历，时间复杂度O(n^2)
     * @param nums
     * @param target
     * @return
     * @throws Exception 
     */
    private static int[] sol1(int[] nums, int target) throws Exception {
    	for(int i = 0;i<nums.length;i++) {
    		for(int j = i+1;j<nums.length;j++) {
    			if(nums[j] == target - nums[i]) {
    				return  new int[]{i,j};
    			}
    		}
    	}
    	throw new Exception("没找到");
    }
    
    /**
     * 哈希表法，借助空间来降低时间复杂度
     *  key存储值，value存储索引。循环数组时边在map判断边把数据加入map，一次循环。
     * @param nums
     * @param target
     * @return
     * @throws Exception
     */
    private static int[] sol2(int[] nums, int target) throws Exception {
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		Integer com = target - nums[i];
    		// 加入map前先检查看map与当前索引是否有匹配项
    		if(map.containsKey(com) && map.get(com) != i) {
    			return new int[]{i,map.get(com)};
    		}
    		map.put(nums[i], i);
    	}
    	throw new Exception("没找到");
    }
    
    
}