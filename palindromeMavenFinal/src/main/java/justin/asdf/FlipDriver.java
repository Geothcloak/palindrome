package justin.asdf;

public class FlipDriver {
	
	public void run() {
		UserInputConsole userInputConsole = new UserInputConsole();
		WordFlipper wordFlipper = new WordFlipper();
		
		boolean result;
		
		result = wordFlipper.flipWord(userInputConsole.getWordFromConsole());
		if (result == false) {
				System.out.println("not a palindrome");
		}else {
			System.out.println("yes a palindrome");
		}
		
		
	}
}
