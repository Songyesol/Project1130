package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayExample2 {
	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple", 1000));
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 1500));
		fruits.add(new Fruit("melon", 1000));
		//Set은 인스턴스 기준으로 같은지 다른지 체크를 하는 컬렉션이기때문에
		//같은 내용이라도 다른 인스턴스(다른 주소값)에 있다면 중복으로 인식하지않음. 


		Iterator<Fruit> filter = fruits.iterator();
		while (filter.hasNext()) {
			Fruit fruit = filter.next();
			System.out.println(fruit.getName() + "-" + fruit.getPrice());
		}
	}

}
