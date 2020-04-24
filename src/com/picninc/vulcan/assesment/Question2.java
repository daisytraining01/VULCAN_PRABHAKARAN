package com.picninc.vulcan.assesment;


public class Question2 {

	int i=0 ;
	int j=1;
	int k=0;
	
	public void fibonaccidisplay(int z)
	{
		System.out.println(i);
		System.out.println(j);
		while(i<=z)
		{
			k=i+j;
			if(k>=z)
				break;
			System.out.println(k);
			i=j;
			j=k;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Question2 f=new Question2();
		f.fibonaccidisplay(10);
	
		
		/* output
		    1
			1
			2
			3
			5
			8
					 */

	}

}
