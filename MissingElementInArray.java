package Day2;

import java.util.Arrays;

public class MissingElementInArray 
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,6,7,8,9};
		Arrays.sort(arr);
    System.out.println("Missing Number is:" + getMissingNumber(arr));
	}
	  private static Integer getMissingNumber(int[] number) 
	  {
		  Integer missed = null;
	    for (int i = 0; i < number.length; i++) 
	    {
        int index = i + 1;
        if (number[i] != index) 
        {
        	missed = index;
            break;
        }
	    }
		return missed;
}
}