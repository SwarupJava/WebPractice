package com.ccav.test;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckWithContntinueKeywordExample {

	public static void main(String[] args) {
	
		ArrayList<String>arrlist = new ArrayList<String>();
		arrlist.add("d");
		arrlist.add("dd");
		arrlist.add("ddd");
		arrlist.add("dddd");
		arrlist.add("ddddd");
		System.out.println(arrlist);	// [d, dd, ddd, dddd, ddddd]

		Iterator<String> iterator = arrlist.iterator();
		while (iterator.hasNext())
		{
			String i = iterator.next();
			if(true) {
				System.out.println("ghn");
				//continue;
			}
		    System.out.println("============>abc"+i);
		    System.out.println("This is not printing");

		}
	}

}
