package com.yedam.generic;

class TV {

}

class Audio {

}

public class PairExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>();
		pair.setKind("Hello");
		pair.setModel(1000);

		Pair<TV, String> tv = new Pair<TV, String>();
		tv.setKind(new TV());
		tv.setModel("평면티비");
		
		Pair<Audio, String> audio = new Pair<Audio, String>();
		audio.setKind(new Audio());
		audio.setModel("AD303");
				
		
		
		
		
		System.out.println(pair.getKind() + "," + pair.getModel());
	}

}
