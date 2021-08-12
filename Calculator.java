package Day2;

public class Calculator 
{
	public static void main(String[] args)
	{
	student S = new student();	   
	   S.Add (10,20,30);
	   S.Sub(5,6);
	   S.Multiple(9,8);
	   S.Divide(9,77);
	}
}
class student
{
	public void Add(int a,int b, int c)
		{
			int d=a+b+c;
			System.out.println("sum of digits" +d);
			}
	public void Sub(int a, int b)
	{
		int c= a-b;
		System.out.println("subtract value is" +c);
		}
	public void Multiple(int a, int b)
	{
		int c =a*b;
		System.out.println("Multiple value is" +c);
		}
	public void Divide(int a, int b)
	{
		int c=a/b;
		System.out.println("Divide value is" +c);
		
	}
	
	}
	

