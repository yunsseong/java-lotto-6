package lotto.exception;

import lotto.view.ExceptionMessage;

public class NotInLottoRange extends RuntimeException{
	public NotInLottoRange() {
		super(ExceptionMessage.NOT_IN_LOTTO_NUMBER_RANGE);
	}
}
