package ee.tthk.tarpe19.peeduli;

public class IpValidator {

	public boolean validateIPv4Address(String ipString) {
		if(hasThreeDots(ipString)) {
			return true;
		}
		return false;
	}

	private boolean hasThreeDots(String ipString) {
		return ipString.chars().filter(c-> c == '.').count()==3;
	}

}
