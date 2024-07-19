package lotto.Controller;

import lotto.Util.Util;
import lotto.View.Message;

public class LottoValidator {
	private Util util = new Util();
	private Message message = new Message();

	public boolean validateAmount(String amountString) {
		try {
			util.validateNotEmpty(amountString);
			util.validateNumber(amountString);
			util.validateLottoAmount(amountString);
			return true;
		} catch (Exception e) {
			message.printError(e.getMessage());
			return false;
		}
	}
	public void validateLottoNum(String lottoNum){
		util.validateNumber(lottoNum);
		util.validateLottoNumRange(lottoNum);
	}

	public boolean validateHitNums(String hitNums) {
		try {
			util.validateNotEmpty(hitNums);
			for (String hitNum : util.splitByComma(hitNums))
				validateLottoNum(hitNum);
			return true;
		} catch (Exception e) {
			message.printError(e.getMessage());
			return false;
		}
	}

}
