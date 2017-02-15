package stackOperation;
import java.io.*;
import java.util.*;
public class stack {
	   

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
	
		System.out.println("Enter the number of elements");
		int n;
		 n=ip.nextInt();
		 int stack[]=new int[n];
	      int top=-1;
		
		
		
	while(true)
	{
		System.out.println("STACK OPERATIONS");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		System.out.println("4.Exit");
	    
        int choice;
        choice=ip.nextInt();
        
        switch(choice)
        {
        case 1: System.out.println("Enter the element to be inserted");
		          int ele;
		         ele=ip.nextInt();
		         if(top==n-1)
			     System.out.println("Stack overflow");
		        
		            else
			     stack[++top]=ele;
                  break;
        case 2:  if(top==-1)
			System.out.println("Stack underflow");
		else
		{
			int pope;
			pope=stack[top--];
			System.out.println("Element popped="+pope);
		} break;
        case 3: if(top==-1)
			System.out.println("No elelments in  the stack");
		else
		{
			for(int i=0;i<=top;i++)
			{
				//System.out.print("\t");
				System.out.print(stack[i]+"-->");
			}
		} break;
        case 4: System.exit(0);
        }
	}
	}		
		

	}

