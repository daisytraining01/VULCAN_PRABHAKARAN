package com.picninc.vulcan.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  Question3{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedReader br =new BufferedReader(new FileReader("src\\ProductList.txt"));
		String readLine;
		int line=0;
		
		while((readLine=br.readLine())!=null)
		{
			
			if(line%2==0)
			{
				
				System.out.println(readLine);
			}
			line++;
			
			
		}

	}

}

/*
 * 
 * 
 * 
 * 	HI There
	how old are you
	I am good
	
	*/
 
