package QUADRATIC;
import java.io.*;
import java.util.*;

public class quadEqn {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the values of coefficients a,b,c");
		int a,b,c,d;
		a=ip.nextInt();
		b=ip.nextInt();
		c=ip.nextInt();
		
		if(a==0)
			System.out.println("Invalid Input");
		else
		{
			d=((b*b)-(4*a*c));
			
			if(d>0)
			{
				System.out.println("Real and distinct roots");
				System.out.println("root1:"+((-b+Math.sqrt(d))/(2*a))+"\n root2:"+((-b-Math.sqrt(d))/(2*a)));
				
			}
			else if(d==0)
			{
				System.out.println("Single root");
				System.out.println("root:"+((-b)/(2*a)));
			}
			
			else
			{
				System.out.println("Imaginary roots");
				System.out.println("root1:"+((-b)/(2*a))+"+i"+(Math.sqrt(-d)/(2*a)));
				System.out.println("root2:"+((-b)/(2*a))+"-i"+(Math.sqrt(-d)/(2*a)));
			}
		}
	}

}
