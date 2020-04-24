package com.picninc.vulcan.assesment;

public class Questtion4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question4 customer=new Question4(1234567,"Daniel", "password");
		System.out.println("from parent class");
		System.out.println("Account number="+customer.getAccountnumber());
		System.out.println("customername="+customer.getUsername());
	
		
		Question4_childclass c1=new Question4_childclass();
		System.out.println("from child class");
		c1.setAccountnumber(22);
		System.out.println("Account number="+c1.getAccountnumber());
		
		
		/*
		 * 
		 * 
		 *  from parent class
		 *  
			Account number=1234567
			customername=Daniel
			
			from child class
			
			Account number=22
		 * 
		 * 
		 * 
		 */
		
		
	}

}
