import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SurviveArrayTest {
	
	SurviveArray testObj;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		
	}

	@Test
	public void testWillSurvive() {
		
		testObj = new SurviveArray();
		
		ArrayList<Integer> testStream = new ArrayList<>();
		for(int i=1;i<=1111;i++)
		{
			testStream.add(i);
		}
		
		int[] testDecayInterval = {2,3,4};
		
		assertEquals("Positive Test Case Passed",1, SurviveArray.willSurvive(testStream, testDecayInterval, 5) );
		
		assertNotEquals("Negative Test Case Passed",2, SurviveArray.willSurvive(testStream, testDecayInterval, 98));
		
		
	}

}
