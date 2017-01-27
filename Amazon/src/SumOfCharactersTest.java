import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumOfCharactersTest {
	
	SumOfCharacters testObj;

	@Before
	public void setUp() throws Exception {
		
		testObj = new SumOfCharacters();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(System.getenv());
	}

	@Test
	public void test() {
		String input = "abc";
		int expected = 16;
		assertEquals(expected, SumOfCharacters.computeString(input));
		assertEquals(1,SumOfCharacters.computeString("A"));
		
	}

}
