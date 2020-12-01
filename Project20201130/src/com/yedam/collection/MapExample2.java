package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "송예솔"), 75);
		map.put(new Student(102, "곰나라"), 60);
		map.put(new Student(201, "송충이"), 70);
		map.put(new Student(201, "송충이"), 50);
		map.put(new Student(103, "곰나라"), 88);

		// 1. keySet()
		Set<Student> set = map.keySet();
		int sumScore = 0;
		int avgScore = 0;
		int maxScore = 0;

		for (Student student : set) {
			sumScore += map.get(student);
		}
		System.out.println("총 점수계: " + sumScore);
		avgScore = sumScore / map.size();
		System.out.println("평균: " + avgScore);

		// 2.entrySet
		int sum1 = 0;
		int avg1 = 0;
		int max = 0;
		Student name = null;
		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		for (Entry<Student, Integer> ent : entrySet) {
			sum1 += ent.getValue();
			if (ent.getValue() > max) {
				name = ent.getKey();
				max = ent.getValue();
			}
		}

		avg1 = sum1 / map.size();
		System.out.println("entrySet 총계: " + sum1);
		System.out.println("entrySet 평균: " + avg1);
		System.out.println("최고점수 학생: " + name);
		System.out.println("최고점수: " + max);
	}
}
