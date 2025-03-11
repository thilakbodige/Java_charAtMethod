package com.charAtMethod;
import java.util.*;

public class UpperLowerDigitsSymbols 
{
   public static void main(String[] args) 
   {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String s = sc.next();
		        int uppercaseCount = 0;
		        int lowercaseCount = 0;
		        int digitCount = 0;
		        int symbolCount = 0;

		        for (int i = 0; i < s.length(); i++)
		        {
		            char ch = s.charAt(i);

		            if (ch>='A' &&ch<='Z') 
		            {
		                uppercaseCount++;
		            }
		            else if (ch>='a' &&ch<='z')
		            {
		                lowercaseCount++;
		            }
		            else if (ch>='0' &&ch<='9')
		            {
		                digitCount++;
		            }
		            else
		            {
		                symbolCount++;
		            }
		        }

		        System.out.println("Number of Uppercase Letters: " + uppercaseCount);
		        System.out.println("Number of Lowercase Letters: " + lowercaseCount);
		        System.out.println("Number of Digits: " + digitCount);
		        System.out.println("Number of Symbols: " + symbolCount);
		    }
		}