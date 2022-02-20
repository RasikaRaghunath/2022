package array;

import java.util.Arrays;

public class array 
{
	public static void main(String args[])
	{
		int a[]= {23,44,44,89,100,120};
		  
		System.out.println(a[3]);    //89  
		a[4]=90;  //100>>90

		int c []=new int[5];
		System.out.println(c[1]); //null
		c[2]= 200;					
		System.out.println(c[2]); //200 

		char d []=new char[3];
		d[1]='*';				
		System.out.println(d[1]); //*
		System.out.println(d.length);  //3
		boolean s[]=new boolean[3];
		System.out.println(s[2]); //false
	
		System.out.println("length of array is "+a.length); //6
		
		for(int i=0; i<=(a.length-1); i++)
		{
			System.out.print(a[i]+" ");	
			}
		System.out.println();
		
		//To print array values
		System.out.println(Arrays.toString(a));  //{23,44,44,89,100,120};  (I)
		
		for(int x :a)  //to print array values 
		{
			System.out.print(x+" ");	
		}
		
	}
}