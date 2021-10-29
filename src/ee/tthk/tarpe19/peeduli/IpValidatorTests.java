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
	
	@Test
	public void ShouldReturnFourNumbers_GivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected, validator.getNumbers("1.2.3.4"));
	}
	
	@Test
	public void ShouldBe_False_GivenStringWithThreeNumbersAndDots() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.validateIPv4Address("1.2.3."));
	}
	
	@Test
	public void ShouldBe_False_GivenNumbersEndingWith0() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.validateIPv4Address("1.2.3.0"));
	}
	
	@Test
	public void ShouldBe_False_GivenNumbersEndingWith255() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.validateIPv4Address("1.2.3.255"));
	}

}
