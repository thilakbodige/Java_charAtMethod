package com.charAtMethod;
import java.util.*;
public class LowerCaseAlphabetString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int count = 0;
        for (int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            if (ch >='a' && ch<='z')
            {
                count++;
            }
        }
        System.out.println("Number of lowercase alphabets: " + count);
    }
}
