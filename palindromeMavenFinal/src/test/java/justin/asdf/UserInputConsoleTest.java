package justin.asdf;

import org.junit.Before;
import org.junit.Test;

public class UserInputConsoleTest {

	UserInputConsole userInputConsole;
	String testWord;
	@Before
	public void init() {
		userInputConsole = new UserInputConsole();
		testWord = new String();
	}
	@Test
	public void canGetUserInput() {
		
		testWord = userInputConsole.getWordFromConsole();
		System.out.println("testWord: ");
		System.out.println(testWord);
		
	}

}
