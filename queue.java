import java.util.*;
public class queue {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int f=-1;
		int l=-1;
		
		System.out.println("Enter the number of ele in Q");
		int n=ip.nextInt();
		int queue[]=new int[n];
		
		while(true) 
		{
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.display");
			System.out.println("4.Exit");
			int choice=ip.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter the ele to be inserted");
			        int ele=ip.nextInt();
			        if(l==n-1)
			        {
			        	System.out.println("queue is full");

			        }
			        else if (l==-1)
			        {
			        	f=0;
			        	queue[++l]=ele;
			        }
			        else
			        {
			        	queue[++l]=ele;
			        } break;
			        
			case 2: if(l==-1 && f==-1)
			        {
				        System.out.println("q is empty");

			        }
			         else if(l==0)
				        {System.out.println("element deleted"+queue[f]);
				          f=-1;l=-1;
				        }
			         else
			         {
			        	 System.out.println("element deleted"+queue[f++]);

			         } break;
			case 3: if(l==-1)
			{
				System.out.println("empty Q");

			}  
			
			else
			{
				for(int i=f;i<l;i++)
				{
					System.out.print(queue[i]+"-->");

				} 
				System.out.println("");

			} break;
			
			case 4: System.exit(0);



			}

		}
		

	}

}
