package com.picninc.vulcan.assesment;

public class Question6 {
	
	public void display(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--)
		{
			sb=sb.append(str.charAt(i));
			
		}
		if(str.equalsIgnoreCase(sb.toString()))
		{
			
			System.out.println("string is palindrome");
			
		}
		else
		{

			System.out.println("string is not palindrome");	
		}
		
	}


	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubtrin
		
		 Question6 P =new  Question6();
		 P.display("abad");
	
	}

}

//  output: string is not palindrome
