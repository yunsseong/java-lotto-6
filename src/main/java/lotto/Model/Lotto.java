package lotto.Model;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
	private final List<Integer> numbers;


	public Lotto(List<Integer> numbers) {
		validate(numbers);
		this.numbers = numbers;
	}

	private void validate(List<Integer> numbers) {
		if (numbers.size() != 6) {
			throw new IllegalArgumentException();
		}
	}


	public int getHitCount(List<Integer> hitNumList, int bonusNum){
		int count = (int) hitNumList.stream()
			.map(n -> numbers.contains(n))
			.filter(Boolean::booleanValue)
			.count();
		if(count == 5 && numbers.contains(bonusNum) || count == 6)
			return count + 1;
		return count;
	}
}
