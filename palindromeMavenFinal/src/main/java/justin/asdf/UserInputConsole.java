package justin.asdf;

import java.util.Scanner;

public class UserInputConsole {
	
	public String getWordFromConsole() {
		Scanner reader = new Scanner(System.in);
		System.out.println("what word do you want to check?");
		String userInput = reader.nextLine();
		
		return userInput;
	}
}
