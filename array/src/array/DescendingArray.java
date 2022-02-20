package array;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
		int x[]= {1,25,0,96,52,66,20};
		int temp=0;
		
		System.out.print(Arrays.toString(x));
		System.out.println();
		//output: 96 66 52 25 20 1 0
		
		int len= x.length;
		
		for(int i=0; i<len; i++)
			{
			for(int j=i+1;j<len;j++)
				{				
					if(x[i]<x[j])	
					{
						temp=x[i];
						x[i]=x[j];
						x[j]=temp;
						
					}
				}
			}
	
		for(int i=0; i<len; i++)
		{
			System.out.println(x[i]);
		}
	}
	}


