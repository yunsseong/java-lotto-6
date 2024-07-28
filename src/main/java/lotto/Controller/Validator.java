package lotto.Controller;

import lotto.Util.Util;
import lotto.View.Message;

public class Validator {
	private Util util = new Util();
	private Message message = new Message();

	public boolean validateAmount(String amountString) {
		try {
			util.isNotEmpty(amountString);
			util.isNumber(amountString);
			util.isMoreThan(amountString, 1000);
			return true;
		} catch (Exception e) {
			message.printError(e.getMessage());
			return false;
		}
	}

	public boolean validateLottoNum(String lottoString){
		try {
			util.isLottoNum(lottoString);
			return true;
		} catch (Exception e) {
			message.printError(e.getMessage());
			return false;
		}
	}

	public boolean validateHitNums(String hitNumsString) {
		try {
			util.isNotEmpty(hitNumsString);
			util.isUnique(hitNumsString);
			util.isCountRight(hitNumsString, 6);
			for (String hitNum : util.splitByComma(hitNumsString))
				util.isLottoNum(hitNum);
			return true;
		} catch (Exception e) {
			message.printError(e.getMessage());
			return false;
		}
	}
}
