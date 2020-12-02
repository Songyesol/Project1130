package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>(); // treeMap은 오름차순으로 저장
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		System.out.println("scores:첫번째 " + scores.firstEntry().getKey());

		NavigableMap<Integer, String> navigableMap = scores.descendingMap(); // desc(내림차순)
		// 순서를 가지고 있는 인터페이스이다

		System.out.println("navigable:첫번째 " + navigableMap.firstEntry().getKey());

		NavigableSet<Integer> nSet = scores.descendingKeySet();// 역순으로 키 값만 가지고 오겠다.
		System.out.println("scores:첫번째 " + scores.firstKey());
		System.out.println("nSet:첫번째 키 값 " + nSet.first());

		// {34,55,26,48,77} 배열 오름차순 정렬값을 구하는 코드구현
		
		int[] intAry = {34,55,26,48,77};
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i<intAry.length; i++) {
			set.add(intAry[i]);
		}
		for(int i = 0; i<intAry.length; i++) {
			intAry[i]= set.pollFirst();
		}
		for(int i=0; i<intAry.length; i++) {
			System.out.println(intAry[i]);
		}
	
		int[] intAry1 = {34,55,26,48,77};
		for(int i = 0; i<intAry1[i]; i++) {
			int temp =0;
			
		}
	}

}
