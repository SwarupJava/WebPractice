package com.ccav.test;

interface Addable{
	public int say(int i, int j);
}

public class JavaLambdaExpressionWithMultipleParameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable addOne = (i, j)->{
			int sumResult = i+j;
			return sumResult;
		};
		System.out.println("Added sum is ::"+addOne.say(10, 20));
		
		Addable addTwo = (n, m)->{
			int sumAnotherResult = n+m;
			return sumAnotherResult;
		};
		System.out.println("Added another result is ::"+addTwo.say(20, 30));;
	}

}
