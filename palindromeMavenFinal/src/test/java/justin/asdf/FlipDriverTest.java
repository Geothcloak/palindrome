package justin.asdf;

import org.junit.Before;
import org.junit.Test;

public class FlipDriverTest {
	FlipDriver flipDriver;
	@Before
	public void init(){
		flipDriver = new FlipDriver();
	}
	@Test
	public void canRun() {
		flipDriver.run();
	}

}
