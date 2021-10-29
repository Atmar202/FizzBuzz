package ee.tthk.tarpe19.peeduli;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void shouldReturnOneHundredNumbers() {
		assertEquals(100, fb.getNumbers().length);
	}
	
	@Test
	public void PrintFizzOnThreeMultiples() {
		assertEquals(100, fb.getNumbers());
	}

}
