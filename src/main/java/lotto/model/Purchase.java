package lotto.model;

import lotto.view.ExceptionMessage;

public class Purchase {

	private int purchaseQuantity;

	public Purchase(int paymentAmount) {
		if (isDivideIntoThousand(paymentAmount) && checkMinimumPurchaseRequirement(paymentAmount))
			this.purchaseQuantity = divideIntoThousands(paymentAmount);
	}

	private boolean checkMinimumPurchaseRequirement(int paymentAmount) {
		if(paymentAmount >= 1000)
			return true;
		throw new IllegalArgumentException(ExceptionMessage.NOT_DIVIDE_INTO_THOUSANDS);
	}

	private boolean isDivideIntoThousand(int number) {
		int result = number % 1000;
		if (result == 0)
			return true;
		throw new IllegalArgumentException(ExceptionMessage.NOT_DIVIDE_INTO_THOUSANDS);
	}

	private int divideIntoThousands(int number) {
		return number / 1000;
	}

	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}
}
