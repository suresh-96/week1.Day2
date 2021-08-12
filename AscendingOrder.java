package Day2;
public class AscendingOrder 
{
	public static void main(String[] args)
	{
	
		int [] data = new int [] {3,2,11,4,6,7};  
		 int size = data.length;
		// Arrange the array in ascending order 
		for (int i = 0; i < data.length; i++) 
		{
			
	            System.out.println(data[i] + " ");
	          
		 }
		// second largest element
		int res = data[size-2];
		System.out.println("2nd largest element is:"+res);
	}
}

