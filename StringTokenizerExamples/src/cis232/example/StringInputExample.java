package cis232.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringInputExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter names separated by a space");
		String namesInput = keyboard.nextLine();
		StringTokenizer tokens = new StringTokenizer(namesInput);
		
		while(tokens.hasMoreTokens()){
			System.out.println(tokens.nextToken());
		}
		
	}

}
