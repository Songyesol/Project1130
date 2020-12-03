package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	//필드
	static int[] scores = {92,95,87,87,21,100,78};
	
	static int maxOrMin(IntBinaryOperator oper){
		int result = scores[0];  //첫번째값을 초기값으로 해서 비교할 수 있도록. 
		for(int number: scores) {
			result = oper.applyAsInt(result, number);
		}
		return result;
	}
	public static void main(String[] args) {
		int maxValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " +left+ ", right: "+ right);
				return left>right ? left : right ;
			}
			
		});
		System.out.println("최대값: " + maxValue);
		
		int minValue= maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				return left <= right ? left : right;
			}
			
		});
		System.out.println("최소값: " + minValue);
	}
}
