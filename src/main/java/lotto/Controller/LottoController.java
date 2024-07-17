package lotto.Controller;

import lotto.Model.LottoStore;
import lotto.Util.Util;
import lotto.View.Message;

public class LottoController {
	private final LottoStore lottoStore;
	private final Message message;

	private final Util util;

	public LottoController(LottoStore lottoStore, Message message, Util util) {
		this.lottoStore = lottoStore;
		this.message = message;
		this.util = util;
	}

	public void run() {
		lottoStore.buyLotto(purchase());
	}

	public int purchase() {
		String amountString = "";
		do {
			amountString = message.scanner("구매금액을 입력해 주세요.");
		} while (!validateAmount(amountString));
		message.printNewLine();
		return Integer.parseInt(amountString);
	}

	public boolean validateAmount(String amountString) {
		try {
			util.validateNotEmpty(amountString);
			util.validateNumber(amountString);
			lottoStore.validateLottoAmount(amountString);
			return true;
		} catch (Exception e) {
			message.printError(e.getMessage());
			return false;
		}
	}
}
