package com.yedam.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; //중첩클래스...
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Hong", 15);
		map.put("Hwang", 20); //.add가 아닌 .put으로 객체추가
		map.put("Hong", 36); // key값은 중복이 안됌******
		
		Integer val = map.get("Hong"); //value 찾기 
		System.out.println(val);
		Set<Entry<String,Integer>> set2 = map.entrySet();
		for(Entry<String, Integer> setAll :set2) {
			System.out.println("key: " + setAll.getKey() + ", value: " + setAll.getValue());
		}

		Set<String> set1 = map.keySet();
		for(String key1:set1) {
			System.out.println("key: " + key1 + ", value: " + map.get(key1));
		}
		
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(1, "송예솔");
		mapInt.put(2, "송송송");
		mapInt.put(3, "공공공");
		
		String result = mapInt.get(1); // 1번키에 담겨져있는 value보기
		System.out.println(result);
		
		Set<Integer> set = mapInt.keySet(); 
		// mapInt의 키값에 해당되는 모든것을을 가져와서 set컬렉션에 담겠다 라는 의미.
		// value값도 함께 담겨져 있음.
		for(Integer num:set) {
			System.out.println("key: " + num + ", val: " + mapInt.get(num));
		}
		
	
		Set<Entry<Integer,String>> entrySet= mapInt.entrySet();	//key -value를 다 담아와서 set컬렉션에 담겠다... 
		for(Entry<Integer,String> ent:entrySet) {
			System.out.println("key: " + ent.getKey() + ", value: " + ent.getValue());
			
		}
		
		
		
		
		
		
	}
}
