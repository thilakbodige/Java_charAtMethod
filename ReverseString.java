package com.charAtMethod;
import java.util.*;
public class ReverseString 
{
	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		{
		String s="SaiRam";
		String rev="";
		for(int i=(s.length())-1;i>=0;i--) 
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		}
	}

}
