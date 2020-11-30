package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Hong"));
		persons.add(new Person("Hong"));
		persons.add(new Person("Hwang"));
		persons.add(new Person("Park"));
		
		Iterator<Person> iter = persons.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person); //실제 메모리 주소값을 출력해줌
										//중복값은 걸러내지만 들어가는 위치는 다르기 때문에 중복값도 다른 주소값을 출력해줌
		}
	}
}
