package com.zxh.letcode_algorithm.t3;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 * @author Administrator
 *
 */
public class LengthOfLongestSubstring {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	
	/**
	 * 解法思路：滑动窗口，时间复杂度：O(n)
	 * 
	 *不重复子串的开始位置为 start，结束位置为 end
	 *随着 end 不断遍历向后，会遇到与 [start, end] 区间内字符相同的情况，此时将字符作为 key 值，
	 *获取其 value 值，并更新 start，此时 [start, end] 区间内不存在重复字符
	 * 
	 * @param str
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
		int size = 0; // 最大子串长度
		int start = 0;  // 子串开始位置
		int end = 0; // 当前位置
		Map<Character, Integer> map = new HashMap<>();
		for(start = 0,end = 0; end<s.length(); end++) {
			char a = s.charAt(end);
			if(map.containsKey(a)) {
				// 发现重复元素，把开始位置start重置到重复元素位置
				start = Math.max(map.get(a), start);
			}
			// 最大长度判断，取老的最大子串长度和当前子串长度的最大值
			size = Math.max(size, end-start+1);
			// 因为要算长度，所以需要保存【 索引值 + 1】
			map.put(a, end + 1);
		}
		return size;
	}

}
