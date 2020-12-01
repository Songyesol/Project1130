package com.yedam.collection;

import java.util.TreeSet;

public class MapExample4 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(55);
		System.out.println(tset.first()); //저장되어있는 값중 가장 첫번째 값
		System.out.println(tset.last());
		
		TreeSet<String> tstr = new TreeSet<>();
		tstr.add("Hong");
		tstr.add("Hwang");
		tstr.add("Park");
		tstr.add("Choi");
		System.out.println(tstr.first());
		System.out.println(tstr.last());
		
		TreeSet<Student> tstu =new TreeSet<>(); //key값을 기준으로 계층구조 이룸
		tstu.add(new Student(100, "Hong", 70));
		tstu.add(new Student(200, "Hwang", 80));
		tstu.add(new Student(300, "Gong", 90));
		//크다작다라는 기준이 없어서 에러가 남.
		System.out.println(tstu.first().getStudentNo()+", " + tstu.first().getStudentName());
		System.out.println(tstu.last().getStudentNo()+", " + tstu.last().getStudentName());
	}
}

