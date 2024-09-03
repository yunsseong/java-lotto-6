package lotto.exception;

import lotto.view.ExceptionMessage;

public class InvalidLottoNumberCount extends RuntimeException{

	public InvalidLottoNumberCount() {
		super(ExceptionMessage.INVALID_LOTTO_NUMBER_COUNT);
	}
}
