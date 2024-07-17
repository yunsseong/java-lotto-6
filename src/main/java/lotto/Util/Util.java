package lotto.Util;

import java.util.regex.Pattern;

public class Util {

	public void validateNotEmpty(String string) {
		if (string.isEmpty())
			throw new IllegalArgumentException("값을 입력해주세요.");
	}

	public void validateNumber(String string) {
		if (!string.chars().allMatch(Character::isDigit))
			throw new IllegalArgumentException("숫자를 입력해주세요.");
	}

}
