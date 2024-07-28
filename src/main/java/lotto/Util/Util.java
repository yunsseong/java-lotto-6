package lotto.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

	public void isNotEmpty(String string) {
		if (string.isEmpty())
			throw new IllegalArgumentException("값을 입력해주세요.");
	}

	public void isNumber(String string) {
		if (!string.chars().allMatch(Character::isDigit))
			throw new IllegalArgumentException("숫자를 입력해주세요.");
	}

	public void isInRange(String string, int start, int end) {
		int value = Integer.parseInt(string);
		if (value < start || value > end)
			throw new IllegalArgumentException(start + "부터 " + end + "사이의 숫자를 입력해주세요");
	}

	public void isMoreThan(String string, int standard) {
		if(Integer.parseInt(string) < standard)
			throw new IllegalArgumentException(standard + " 이상의 숫자를 입력해주세요");
	}

	public void isUnique(String string) {
		List<String> lottoNumList = splitByComma(string);
		if (lottoNumList.stream().distinct().count() != lottoNumList.size())
			throw new IllegalArgumentException("중복되지 않게 숫자를 입력해주세요.");
	}

	public void isLottoNum(String lotto) {
		this.isNumber(lotto);
		this.isInRange(lotto, 1, 45);
	}

	public void isCountRight(String string, int count){
		List<String> stringList = stringToStringList(string);
		if(stringList.size() != count)
			throw new IllegalArgumentException("숫자 " + count +"개를 입력해주세요.");
	}

	public List<String> splitByComma(String string) {
		return Arrays.stream(string.split(",")).toList();
	}

	public List<String> stringToStringList(String string) {
		return new ArrayList<>(splitByComma(string));
	}

	public List<Integer> stringToIntegerList(String string) {
		return splitByComma(string).stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList());
	}

}
