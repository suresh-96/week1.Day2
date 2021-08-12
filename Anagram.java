package Day2;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		 String[] s1 = {"stops"};
	        String[] s2 = { "posts" };
	 
	        if (Arrays.equals(s1, s2)) 
	        {
	            System.out.println("Both arrays are equal");
	        }
	        else {
	            System.out.println("Both arrays are not equal");
	        }
	    
	
	String text1 = "stops"; 
	String text2 = "postss";   
	char[] ch=text1.toCharArray();
	char[] sh=text2.toCharArray();
	{
	for(int i=0;i<ch.length;i++)
	for(int j=0;j<sh.length;j++)
	
	{    
	System.out.println("char at "+i+" index is: "+ch[i]); 
	System.out.println("char at "+j+" index is: "+sh[j]); 
	}  
	}
	}
}
	

