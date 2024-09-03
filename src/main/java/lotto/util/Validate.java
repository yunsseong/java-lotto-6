package lotto.util;

import java.util.List;

public class Validate {

	public static boolean isNumber(String input){
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isAllNumber(List<String> inputList) {
		try {
			inputList.stream()
				.map(Integer::parseInt);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
