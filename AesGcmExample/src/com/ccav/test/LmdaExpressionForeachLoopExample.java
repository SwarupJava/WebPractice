package com.ccav.test;

import java.util.ArrayList;
import java.util.List;

public class LmdaExpressionForeachLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> nameList = new ArrayList<String>();
        nameList.add("Ramanannda");
        nameList.add("Suresh");
        nameList.add("Parmananda");
        nameList.add("Kamesh");
        
		//foraech loop with lambdaexpression
		nameList.forEach( 
			(n)->{System.out.println(n);} 
		);
		 
		System.out.println("------------------------------");
        
        //forach loop without lambda expression
		 for(String name : nameList) { 
			 System.out.println(name);
	     } 
		 
	}

}
