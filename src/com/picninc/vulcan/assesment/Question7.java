package com.picninc.vulcan.assesment;

import java.util.HashSet;
import java.util.Iterator;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<>();
		
		set.add("key1,Testvalue1");
		set.add("key2,Testvalue1");
		set.add("key3,Testvalue2");
		set.add("key4,Testvalue2");
		
		Iterator<String>i=set.iterator();
		
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
		

		
		
		

	}

}
