package array;

public class duplicateNumber 
{
	public static void main(String args[])
	{
		//Duplicate Numbers from Array...
		
		int numbers[]= {1,5,6,9,8,4,25,64,83,95,5,6,25,35,64};
		
		System.out.println(numbers);
		
		for(int i=0; i<numbers.length;i++)
		{
			
			if(i==numbers[i])
			{
				System.out.println("This is duplicate Number");
			}
			
		}
	}

}
