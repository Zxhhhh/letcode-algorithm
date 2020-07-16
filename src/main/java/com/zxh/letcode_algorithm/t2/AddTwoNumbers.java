package com.zxh.letcode_algorithm.t2;

/**
 * 
 * 两数相加
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 * @author Administrator
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
//		n1.next = new ListNode(4);
//		n1.next.next = new ListNode(3);
		ListNode n2 = new ListNode(9);
		n2.next = new ListNode(9);
//		n2.next = new ListNode(6);
//		n2.next.next = new ListNode(4);
		ListNode result = addTwoNumbers(n1, n2);
		while(result != null){
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode currentNode = null;
		Integer carry = 0;
		while(l1 != null || l2 != null || carry == 1) {
			int newValue = 0;
			if(l1 != null) {
				newValue += l1.val;
			}
			if(l2 != null) {
				newValue += l2.val;
			}
			newValue += carry;
			if(result != null) {
				ListNode node = new ListNode(newValue % 10);
				currentNode.next = node;
				currentNode = currentNode.next;
			} else {
				result = new ListNode(newValue % 10);
				currentNode =  result;
			}
			
			carry = newValue / 10;
			l1 = l1 == null ? null :l1.next;
			l2 = l2 == null ? null :l2.next;
		}
		return result;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int x) {
		val = x;
	}
}

