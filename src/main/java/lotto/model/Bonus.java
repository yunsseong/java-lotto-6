package lotto.model;

import lotto.exception.NotInLottoRange;
import lotto.view.ExceptionMessage;

public class Bonus {

	private int bonusNumber;

	public Bonus(int number) {
		isNumberInLottoRange(number);
		this.bonusNumber = number;
	}

	private void isNumberInLottoRange(int number) {
		if(number > 45 || number < 1)
			throw new NotInLottoRange();
	}

	public int getBonusNumber() {
		return bonusNumber;
	}
}
