package basicprograms;

import java.util.Scanner;

public class LCM 						// Least Comman Multiple
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		int n1=s.nextInt();
		
		System.out.println("Enter second number: ");
		
		int n2=s.nextInt();
		
		int large=n1>n2? n1:n2;
		
		for (; ; large++) 
		{
			if (large%n1==0 && large%n2==0) 
			{
				System.out.println(large);
				break;
			}
			
		}
	}
		
}
