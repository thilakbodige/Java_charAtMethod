package com.charAtMethod;
import java.util.*;
public class StringPolyndromeornot 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "MALAYALAM";
        String rev = "";

        for (int i=s.length()-1;i>= 0;i--) 
        {
            char ch = s.charAt(i);
            rev = rev + ch;
        }

        if (s.equals(rev)) 
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is Not a Palindrome");
        }
    }
}
