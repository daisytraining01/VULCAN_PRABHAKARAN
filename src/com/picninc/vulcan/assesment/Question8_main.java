package com.picninc.vulcan.assesment;


public class Question8_main implements Question8_Interface{
	
	int c;
	int d;
//method declaration
public void addition(int a,int b)
{
	c=a+b;
	System.out.println("the addition of two numbers is"+c);
	
}
public void addition(int a,int b,int c)
{
	d=a+b+c;
	System.out.println("the addition of three numbers is"+d);
	
}

//main method
public static void main(String[] args) {
	
	// object creation
	
	Question8_main calc=new Question8_main();
	calc.addition(10,25);
	calc.addition(10, 25,35);


}

}

/*   output
 *  the addition of two numbers is35
	the addition of three numbers is70
 * 
 * 
 * 
 * 
 */

