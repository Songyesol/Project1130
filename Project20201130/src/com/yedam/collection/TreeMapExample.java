package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		
		for(Integer num : scores.keySet()) {
			System.out.println(num);
		}
		for(Map.Entry<Integer,String> entry : scores.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		Map.Entry<Integer,String> ent = scores.firstEntry();
		System.out.println("가장 낮은 점수: "+ ent.getKey() + "-"+ent.getValue());
		
		ent = scores.lastEntry();
		ent.getKey();
		ent.getValue();
		System.out.println("가장 높은 점수: "+ ent.getKey() + "-"+ent.getValue());
	
		ent = scores.lowerEntry(87);
		System.out.println("87점 아래 점수: "+ ent.getKey() + "-"+ent.getValue());
	
		ent = scores.higherEntry(95);
		System.out.println("95점 위의 점수: "+ ent.getKey() + "-"+ent.getValue());
		
		ent = scores.floorEntry(80);
		System.out.println("80점이거나 바로 아래 점수 "+ ent.getKey() + "-"+ent.getValue());
	
		ent = scores.ceilingEntry(80);
		System.out.println("80점이거나 바로 위의 점수: "+ ent.getKey() + "-"+ent.getValue());
		
		while(!scores.isEmpty()) {
			ent= scores.pollFirstEntry();
			System.out.println("가장 낮은 점수: "+ ent.getKey() + "-"+ent.getValue() +
					"(남은객체 수 : " + scores.size() +")" ); 
		}
	}
}
