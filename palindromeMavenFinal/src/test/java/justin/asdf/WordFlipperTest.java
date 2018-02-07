package justin.asdf;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordFlipperTest {
	WordFlipper wordFlipper;
	@Before
	public void init() {
		wordFlipper = new WordFlipper();
	}
	
	@Test
	public void canFlipWord() {
		boolean result = wordFlipper.flipWord("hi");
		Assert.assertEquals(false, result);
		
		result = wordFlipper.flipWord("xxx");
		Assert.assertEquals(true, result);
	}

}
