package com.charAtMethod;
import java.util.*;
public class StringSymbols 
{
  public static void main(String[] args)
	{
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String s = sc.next();
		        System.out.println("Symbols in the string:");
		        for (int i = 0;i< s.length(); i++)
		        {
		            char ch = s.charAt(i);
if (!((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z') || (ch>='0' && ch<='9') || ch == ' '))
{
    System.out.print(ch + " ");

}
		 
	}

}
}
