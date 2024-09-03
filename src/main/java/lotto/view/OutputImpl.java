package lotto.view;

import java.util.List;

public class OutputImpl implements Output{

	@Override
	public void printExceptionMessage(String message) {
		System.out.println("[ERROR] " + message);
	}

	@Override
	public void printBuyAmountMessage() {
		System.out.println(RuntimeMessage.INPUT_BUY_AMOUNT);
	}

	@Override
	public void printBuyAmount(int buyAmount) {
		System.out.println(buyAmount + RuntimeMessage.OUTPUT_BUY_AMOUNT);
	}

	@Override
	public void printLottoNumber(List<String> lottoList) {

	}

	@Override
	public void printInputHitNumberMessage() {

	}

	@Override
	public void printInputBonusNumber() {

	}

	@Override
	public void printHitStaticsMessage() {

	}

	@Override
	public void printHitStatics(List<Integer> HitStatics) {

	}

}
