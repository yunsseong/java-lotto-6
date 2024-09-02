package lotto.view;

import java.util.List;

public interface Output {

	public void printBuyAmountMessage();
	public void printBuyAmount(int buyAmount);
	public void printLottoNumber(List<String> lottoList);
	public void printInputHitNumberMessage();
	public void printInputBonusNumber();
	public void printHitStaticsMessage();
	public void printHitStatics(List<Integer> HitStatics);
	public void printExceptionMessage(String message);
}
