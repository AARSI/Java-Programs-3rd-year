import java.util.Scanner;
import java.lang.Math;
public class Roots {
	int hdeg;
	double coeff[];
	double ival,value;
	int it;
	public void enter()
{
	System.out.println("enter the highest degree");
	Scanner obj=new Scanner(System.in);
	hdeg=obj.nextInt();
	coeff=new double[hdeg+1];

	System.out.println("enter the coefficients");
	for(int i=0;i<=hdeg;i++)
	{
	System.out.println("coeff of x^"+i);
	coeff[i]=obj.nextDouble();
	}
	System.out.println("enter no of times");
	it=obj.nextInt();
	System.out.println("enter initial value");
	ival=obj.nextDouble();
}

	public double f_of_x()
	{
	double result1=0;
	for(int i=0;i<=hdeg;i++)
	{
	result1=result1+(coeff[i]*(Math.pow(ival,i)));
	}
	return result1;
	}
	
	

	public double f_d_of_x()
	{
	double result2=0;
	for(int i=1;i<=hdeg;i++)
	{
	result2=result2+(coeff[i]*i*(Math.pow(ival,i-1)));
	}
	return result2;
	}

	public void final_ans()
	{
	for(int i=0;i<it;i++)
	{
	value=ival-(f_of_x()/f_d_of_x());
	System.out.println("soln "+(i+1)+" = "+value);
	ival=value;
	}

	}

	public static void main(String[] a)
	{
	Roots object=new Roots();
	object.enter();
	object.final_ans();
	}

}
