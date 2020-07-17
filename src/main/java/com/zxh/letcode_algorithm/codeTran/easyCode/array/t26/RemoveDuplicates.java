package com.zxh.letcode_algorithm.codeTran.easyCode.array.t26;

import java.util.Arrays;

/**
 * 删除 有序数组中的重复项，返回移除后数组的新长度
 * @author zhuxianhao
 *
 */
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{0,0,0,1,1,1,2,2,3,4}));
	}
	
	
    public static int removeDuplicates(int[] nums) {
    	return sol_right(nums);
    }
    
    /**
     * 正解：双指针法，时间复杂度O(n)
     * 由于是有序数组，重复元素一定是连续的。
     * 可以放置两个指针 i 和 j，其中 i 是慢指针，而 j 是快指针。
     * 只要 nums[i] = nums[j]nums[i]=nums[j]，我们就增加 jj 以跳过重复项。
	 * 当我们遇到 nums[j] != nums[i]时，说明跳过重复项的运行已经结束，
	 * 因此我们必须把它（nums[j]nums[j]）的值复制到 nums[i + 1]nums[i+1]。
	 * 然后递增 ii，接着我们将再次重复相同的过程，直到 jj 到达数组的末尾为止。
     * @param nums
     * @return
     */
    public static int sol_right(int[] nums) {
    	int i = 0;
    	for(int j = 1;j < nums.length; j++) {
    		if(nums[i] != nums[j]) {
    			i++;
    			// 给 i赋值，以让i和j比较新值
    			nums[i] = nums[j];
    		}
    	}
    	// 因为i一开始是0，要把第一个重复元素加上
    	return i+1;
    }
    
    /**
     * 暴力破解法，逐个遍历，效率很低，时间复杂度O(n^2)
     * @param nums
     * @return
     */
    public static int sol_wrong(int[] nums) {
    	int size = nums.length;
    	for(int i = 0;i<size;i++) {
    		for(int j = i+1;j<size;j++) {
    			if(nums[i] == nums[j]) {
    				for(int k=j;k<nums.length-1;k++) {
    					nums[k] = nums[k+1];
    				}
    				size--;
    				j--;
    				System.out.println(Arrays.toString(nums));
    			}
    		}
    	}
    	return size;
    }
}
