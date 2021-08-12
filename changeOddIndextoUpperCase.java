package Day2;

import java.rmi.dgc.Lease;

public class changeOddIndextoUpperCase 
{
	public static void main(String[] args) 
	{
		String str = "changeme";
		student1 L = new student1();
	    L.Strg();
		L.pro();
	}
}
class student1
{
	public void Strg()
	{
		String str = "changeme";
System.out.println("String: "+str);
char[] ch = str.toCharArray();
System.out.println("Character Array...");
for (int i = 0; i < ch.length; i++) {
   System.out.print(ch[i]+" ");
}
	}
	public void pro() 
	{
		String str = "changeme";
		 for(int i = 0; i<str.length(); i++)
		 {
			 char a = str.charAt(i);
		 }
		      
			System.out.println( ", ");	
		
	}
}