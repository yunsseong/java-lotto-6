package lotto.model;

import java.util.List;

import lotto.exception.InvalidLottoNumberCount;
import lotto.exception.NotInLottoRange;
import lotto.view.ExceptionMessage;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new InvalidLottoNumberCount();
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
