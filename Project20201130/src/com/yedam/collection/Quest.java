package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(20);
		list.add(25);
		int sum = 0;
		for(Integer numbers : list) {
			sum += numbers;
		}
		System.out.println( "전체의 합: " + sum);
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);
		nums.add(30);
		nums.add(35);
		nums.add(40);
		nums.add(20);
		nums.add(25);

		int sum1 = 0;
		for(Integer numSum : nums) {
			sum1 += numSum;			
		}
		System.out.println("중복된 값을 제외한 합: " + sum1);
	
	}
}
