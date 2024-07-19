package lotto.Util;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Util {

	public void validateNotEmpty(String string) {
		if (string.isEmpty())
			throw new IllegalArgumentException("값을 입력해주세요.");
	}

	public void validateNumber(String string) {
		if (!string.chars().allMatch(Character::isDigit))
			throw new IllegalArgumentException("숫자를 입력해주세요.");
	}

	public void validateLottoAmount(String amountString) {
		int amount = Integer.parseInt(amountString);
		if (amount < 0)
			throw new IllegalArgumentException("구매 금액은 0보다 작을 수 없습니다.");
		if (amount < 1000)
			throw new IllegalArgumentException("최소 구매 금액은 1000원 이상입니다.");
	}

	public void validateLottoNumRange(String lottoString) {
		int lottoNum = Integer.parseInt(lottoString);
		if (lottoNum > 45 || lottoNum < 1)
			throw new IllegalArgumentException("1부터 45 사이의 값을 입력해주세요");
	}

	public String[] splitByComma(String string) {
		return string.split(",");
	}

	public List<Integer> stringToIntegerList(String string) {
		return Arrays.stream(splitByComma(string))
			.map((Integer::parseInt))
			.collect(Collectors.toList());
	}

}
