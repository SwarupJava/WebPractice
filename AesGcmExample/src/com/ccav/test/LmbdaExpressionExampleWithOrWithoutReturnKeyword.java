package com.ccav.test;

interface Addabl {
	int add(int i, int j);
}

public class LmbdaExpressionExampleWithOrWithoutReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression without return keyword
		Addabl addOne = (i, j)->(i+j);
		System.out.println("addition one is ::"+addOne.add(200, 100));
		
		//Lambda Expression with return keyword
		Addabl addTwo = (i, j)->{
			return (i+j);
		};
		System.out.println("addition another is ::"+addTwo.add(10, 20));
	}

}
