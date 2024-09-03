package lotto.view;

import java.util.List;

public class OutputImpl implements Output{

	@Override
	public void printExceptionMessage(String message) {
		System.out.println();
		System.out.println("[ERROR] " + message);
	}

	@Override
	public void printBuyAmountMessage() {
		System.out.println();
		System.out.println(RuntimeMessage.INPUT_BUY_AMOUNT);
	}

	@Override
	public void printBuyAmount(int buyAmount) {
		System.out.println();
		System.out.println(buyAmount + RuntimeMessage.OUTPUT_BUY_AMOUNT);
	}

	@Override
	public void printLottoList(List<List<Integer>> lottoList) {
		lottoList
			.forEach(System.out::println);
	}

	@Override
	public void printInputHitNumberMessage() {
		System.out.println();
		System.out.println(RuntimeMessage.INPUT_HIT_NUMBER);
	}

	@Override
	public void printInputBonusNumber() {
		System.out.println();
		System.out.println(RuntimeMessage.INPUT_BONUS_NUMBER);
	}

	@Override
	public void printHitStaticsMessage() {

	}

	@Override
	public void printHitStatics(List<Integer> HitStatics) {

	}

}
