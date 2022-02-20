package array;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		char []Animal= {'A','N','I','M','A','L'};
		//System.out.println(Animal);
		
		for(int i=0;i<Animal.length;i++)
		{
			System.out.print(Animal[i]+" ");			
		}
		System.out.println();
		for(int i=Animal.length-1;i>=0;i--)
		{
			System.out.print(Animal[i]+" ");
		}
	}
}
