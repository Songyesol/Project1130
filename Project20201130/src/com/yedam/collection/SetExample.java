package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("world");
		set.add("world");
		set.add("Welcome");
		
//		for(String str:set) { //무작위로 보따리에 담기때문에 index값이 없음-> enhanced for 문을 사용해야한다. 
//							 // for(int i=0....)은 사용할 수 없음.
//			System.out.println(str); 
			//index값이 없어서 순서가 없음
			//중복된 값은 제외하고 출력함
//		}
		Iterator<String>iter = set.iterator(); //요소들을 반복적으로 획득하기 위해서 반복자를 획득하는 방식
		while(iter.hasNext()){ //요소가 담겨있는지 확인하고 있다면 True 
			String str = iter.next(); //요소를 하나씩 가지고 오겠다
			System.out.println(str);
		}
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);
		
		numbers.remove(26); //26에 해당되는 건 다 삭제
		
		int sum = 0;
		for(Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers: " + sum);
	}
}
