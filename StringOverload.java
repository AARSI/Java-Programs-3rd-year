import java.io.*;
import java.util.*;
public class StringOverload {
	String name="aarsi kumar";
	
	
	
	void stringcopy()
	{
		String str1;
	     str1=name;
		System.out.println("after copying:"+str1);
	}
	
	void concatenate()
	{
		String str2=" Kumar";
		String fullname=name.concat(str2);
		System.out.println("after cocat:"+fullname);
	}
	
	void  strlength()
	{
		int len=name.length();
		System.out.println("Length of string is:"+len);
	}
	
	void character(int pos)
	{
		char c=name.charAt(pos-1);
		System.out.println("Char at position 2:"+c);
	}
	
	void compare()
	{
		String str3="Aarsi";
		int result=name.compareTo(str3);
		if(result==0)
			System.out.println("The two strings r equal");
		else
			System.out.println("not equal");
		
	}
	//StringOverload()

	public static void main(String[] args) {
		StringOverload op=new StringOverload();
		op.stringcopy();
		op.concatenate();
		op.strlength();
		op.character(2);
		op.compare();
		
		

	}

}
