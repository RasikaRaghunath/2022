package array;
import java.util.Arrays;  
public class AscendingArray 
{
	public static void main(String[] args) 
	{
		int x[]= {1,25,0,96,52,66,20};
		//output: 96 66 52 25 20 1 0
		System.out.print(Arrays.toString(x));
		
		int temp=0;		
		System.out.println();		
		
		int len= x.length;
		for(int i=0; i<len; i++)  //0 1 2 3
			{
			
			for(int j=i+1;j<len;j++)  //1 2 3 
				{			
					if(x[i]>x[j])	//96>25
					{
						temp=x[i];   //96
						x[i]=x[j];   //25
						x[j]=temp;   //96
					}
				}
			}
	
		for(int i=0; i<len; i++)
		{
			System.out.print(" "+x[i]);
		}
	}
}
