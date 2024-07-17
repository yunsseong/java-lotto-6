package lotto.Model;

public class LottoStore {

	public void validateLottoAmount(String amountString) {
		int amount = Integer.parseInt(amountString);
		if (amount < 0)
			throw new IllegalArgumentException("구매 금액은 0보다 작을 수 없습니다.");
		if (amount < 1000)
			throw new IllegalArgumentException("최소 구매 금액은 1000원 이상입니다.");
	}
}
