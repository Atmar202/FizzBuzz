package ee.tthk.tarpe19.peeduli;

import static org.junit.Assert.*;
import org.junit.*;

public class IpValidatorTests {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void ShouldReturn_False_GivenEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.validateIPv4Address(""));
	}
	
	@Test
	public void ShouldBe_True_GivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		assertTrue(validator.validateIPv4Address("1.2.3.1"));
	}

}
