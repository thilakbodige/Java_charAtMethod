package com.charAtMethod;
import java.util.*;
public class TwoHalfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String firstHalf = "";
        String secondHalf = "";
        int size = s.length();
        int half = size / 2;

        for (int i = 0; i < size; i++)
        {
            char ch = s.charAt(i);
            if (i < half) 
            {
                firstHalf = firstHalf + ch;
            } else 
            {
                secondHalf = secondHalf + ch;
            }
        }

        System.out.println("First Half: " + firstHalf);
        System.out.println("Second Half: " + secondHalf);
    }
}
