package com.sampleapp;

import java.util.Scanner;

public class SubString{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sting value");
		String input = sc.nextLine();
		
		
		//print first 3 charecters
		
		if(input.length()>= 3) {
			System.out.println("First 3 charecters of string is :" + input.substring(0,3));
		}
		
		if (input.length()>=3) {
			System.out.println("The last 3 chars of string is:" + input.substring(input.length()- 3));
		}

        // print all substrings
        System.out.println("All substrings of the given string are:");

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
	}
	
	
}