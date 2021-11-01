package ee.tthk.tarpe19.peeduli;

import static org.junit.Assert.*;
import org.junit.*;

public class IpValidatorTests {

	private IpValidator validator;
	
	@Before
	public void setUp() throws Exception {
		validator = new IpValidator();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void ShouldReturn_False_GivenEmptyStringParameter() {
		assertFalse(validator.validateIPv4Address(""));
	}
	
	@Test
	public void ShouldBe_True_GivenStringWithThreeDots() {
		assertTrue(validator.validateIPv4Address("1.2.3.1"));
	}
	
	@Test
	public void ShouldReturnFourNumbers_GivenStringWithThreeDots() {
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected, validator.getNumbers("1.2.3.4"));
	}
	
	@Test
	public void ShouldBe_False_GivenStringWithThreeNumbersAndDots() {
		assertFalse(validator.validateIPv4Address("1.2.3."));
	}
	
	@Test
	public void ShouldBe_False_GivenNumbersEndingWith0() {
		assertFalse(validator.validateIPv4Address("1.2.3.0"));
	}
	
	@Test
	public void ShouldBe_False_GivenNumbersEndingWith255() {
		assertFalse(validator.validateIPv4Address("1.2.3.255"));
	}
	
	@Test
	public void ShouldBe_False_GivenStringWithFourNumbersNotInRange0_255(){
		assertFalse(validator.validateIPv4Address("1.2.3.257"));
		assertFalse(validator.validateIPv4Address("1.2.300.4"));
		assertFalse(validator.validateIPv4Address("1.256.3.4"));
		assertFalse(validator.validateIPv4Address("312.2.3.4"));
	}
	
	@Test
	public void ShouldBe_False_GivenIPStartingWith0() {
		assertFalse(validator.validateIPv4Address("0.2.3.254"));
	}
	

}
