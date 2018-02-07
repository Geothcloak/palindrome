package justin.asdf;

public class WordFlipper {
	public boolean flipWord(String usersWord) {
		int wordLength = usersWord.length();
		
		StringBuilder tempWord = new StringBuilder();
		String[] splitUsersWord = usersWord.split("");
		
		int flag = wordLength - 1;
		for (int x = 0; x < wordLength; x++) {
			tempWord.append(splitUsersWord[flag]);
			flag--;
		}
		
		return tempWord.toString().equals(usersWord);
	}
}
