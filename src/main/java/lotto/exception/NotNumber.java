package lotto.exception;

import lotto.view.ExceptionMessage;

public class NotNumber extends RuntimeException{

	public NotNumber() {
		super(ExceptionMessage.NOT_INT_TYPE_INPUT);
	}
}
