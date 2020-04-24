package com.picninc.vulcan.assesment;

public class Question5 {

	
	public void compare(String s1,String s2)
	{

	
	if(s1==s2)
	{
		System.out.println(" The strings are equal");
		
	}
	
	else
	{
		System.out.println("the strings are not equal");
	}
	
	
	}
	
	public void Stringremove(String str)
	{
		
		
		System.out.println("the final value is"+str.replace("ST",""));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubtr

		Question5  string=new Question5();
		
		string.compare("hi","hello");
		string.Stringremove("REST ASSURED");
		
		
		
	}

}


/*
 * 
 *    Output
 *   the strings are not equal
     the final value isRE ASSURED
 * 
 * 
 * */
