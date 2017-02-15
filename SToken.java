import java.util.*;


public class SToken {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String text;
		String word;
		System.out.println("Enter the text:");
		text=ip.nextLine();
		System.out.println("Enter the word:");
		word=ip.next();
		
		StringTokenizer Ttext=new StringTokenizer(text);
		int count=0;
		while(Ttext.hasMoreTokens())
		{
			if(Ttext.nextToken().equals(word))
			{
				count++;
				}
		}
		
		System.out.println("count="+count);
		
		
		

	}

}
