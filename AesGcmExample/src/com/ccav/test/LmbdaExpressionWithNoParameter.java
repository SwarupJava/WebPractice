package com.ccav.test;

interface Sayab {
	public String say();
}//interface name should be unique in  package

public class LmbdaExpressionWithNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayab s=()->{
			return "I have nothing to Say";
		};
       System.out.println(s.say());
	}

}
