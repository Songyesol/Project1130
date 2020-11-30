package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello"); //추가하고 싶으면 .add()
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice"); //추가하면 두번째 위치에 있던 변수값을 밀고 들어감
		System.out.println("size: " + list.size()); //컬랙션에 몇개의 값이 들어있는지 .size로 알 수 있음.		
		list.add(list.size(), "last"); //리스트의 마지막 인덱스값에다가 추가하겠다. 
		
		
//		for(int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		list.remove(1); //제거하고싶으면 .remove()
		for(int i=0; i <list.size(); i++) {
			System.out.println("index:" + i+ "," + list.get(i));
		}
		
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		
		int sum = 0;
		for(Integer num:listNum) {
			sum+= num;			
		}
		System.out.println("listNum 합계: "+ sum);
	}
}
