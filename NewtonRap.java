import java.io.*;
import java.lang.*;
import java.util.*;
public class NewtonRap {
	int hdegree;
	double coeff[];
	int itno;
    double ians;
	

	void enter()
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the highest degree of polynomial");
		hdegree=ip.nextInt();
		
		coeff=new double[hdegree+1];
		
		for(int i=0;i<=hdegree;i++)
		{
			
			System.out.println("Enter the coeff for x^"+i);
			coeff[i]=ip.nextDouble();
		}
		
		System.out.println("Enter the number of iterations to be done");
		itno=ip.nextInt();
		
		System.out.println("Enter the approx ans");
		ians=ip.nextDouble();
		
		
		
	}
	
	double f_o_x()
	{    double result1=0;
		for(int i=0;i<=hdegree;i++)
		result1=result1+(coeff[i]*Math.pow(ians, i));
		return result1;
		
	}
	
	double f_d_o_x()
	{
		double result2=0;
		for(int i=1;i<=hdegree;i++)
			result2=result2+(coeff[i]*i*Math.pow(ians, i-1));
		return result2;
	}
	
	
	void output()
	{
		for(int i=0;i<itno;i++)
		{
		double result=ians-(f_o_x()/f_d_o_x());
		System.out.println("solution="+result);
		ians=result;
		}
	}
	
	
	public static void main(String[] args) {
       NewtonRap n=new NewtonRap();
       n.enter();
       n.output();


	}

}
