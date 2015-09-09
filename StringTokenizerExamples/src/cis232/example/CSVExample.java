package cis232.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CSVExample {

	public static void main(String[] args) throws IOException {
		File appetizerFile = new File("Appetizers.csv");
		Scanner input = new Scanner(appetizerFile);
		ArrayList<Appetizer> apps = new ArrayList<>();
		
		
		while(input.hasNextLine()){
			StringTokenizer tokens = new StringTokenizer(input.nextLine(),
					",");
			
			if(tokens.countTokens() >= 2){
				Appetizer app = new Appetizer(tokens.nextToken(), tokens.nextToken());
				apps.add(app);
			}
		}
		
		for(Appetizer app : apps){
			System.out.println(app);
		}
		
	}

}
