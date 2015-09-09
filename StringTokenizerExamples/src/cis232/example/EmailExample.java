package cis232.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailExample {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in email addresses, separated with ;");
		String emailsInput = keyboard.nextLine();
		
		StringTokenizer addressTokens = new StringTokenizer(emailsInput, ";");
		
		while(addressTokens.hasMoreTokens()){
			//Process an email address
			String email = addressTokens.nextToken();
			email = email.trim();
			
			StringTokenizer emailTokens = new StringTokenizer(email, "@", true);
			if(emailTokens.countTokens() != 3){
				System.err.printf("%s is an invalid email%n", email);
				
			}else{
				String beforeAt = emailTokens.nextToken();
				String atSymbol = emailTokens.nextToken();
				String afterAt = emailTokens.nextToken();
				if(afterAt.equalsIgnoreCase("gmail.com")){
					System.out.printf("*valid* %s%n", email);
				}else{
					System.out.println(email);
				}
			}
			
			System.err.flush();
			System.out.flush();
		}
	}
	
}
