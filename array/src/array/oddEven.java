package array;

public class oddEven
{

	public static void main(String[] args) 
	{
		int Array[]= {4,5,84,96,36,789,2,6,9};
		int Even = 0,Odd=0;
		for(int i=0;i<Array.length;i++)
		{
			if((Array[i])%2==0)
				{
					Even++;
				}
			else
			{
				Odd++;
				
			}
		}
		System.out.println("Array has  "+Even+" Even numbers");
		System.out.println("Array has  "+Odd+" Odd numbers");
	}
}

