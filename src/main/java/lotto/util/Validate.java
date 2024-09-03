package lotto.util;

public class Validate {

	public static boolean isNumber(String input){
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
