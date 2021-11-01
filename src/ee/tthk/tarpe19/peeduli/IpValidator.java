package ee.tthk.tarpe19.peeduli;

import java.util.Arrays;

public class IpValidator {

	public boolean validateIPv4Address(String ipString) {
		if(hasThreeDots(ipString) && hasFourNumbers(ipString) && 
				numbersInRange0_255(ipString) && 
				!(lastNumber(ipString) == 255 || lastNumber(ipString) == 0
				|| firstNumber(ipString) == 0 || firstNumber(ipString) == 255)) {
			return true;
		}
		return false;
	}

	private boolean numbersInRange0_255(String ipString) {
		return Arrays.stream(getNumbers(ipString))
				.allMatch(nr-> nr>=0&&nr<=255);
	}

	private boolean hasFourNumbers(String ipString) {
		return getNumbers(ipString).length == 4;
	}

	private boolean hasThreeDots(String ipString) {
		return ipString.chars().filter(c-> c == '.').count()==3;
	}

	public int[] getNumbers(String string) {
		return Arrays
				.stream(string.split("\\."))
				.mapToInt(Integer::parseInt)
				.toArray();
	}
	
	private int lastNumber(String ipString) {
		return getNumbers(ipString)[getNumbers(ipString).length-1];
	}
	
	private int firstNumber(String ipString) {
		return getNumbers(ipString)[0];
	}

}
