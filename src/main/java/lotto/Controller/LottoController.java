package lotto.Controller;

import java.util.List;

import lotto.Model.LottoStore;
import lotto.Util.Util;
import lotto.View.Message;

public class LottoController {
	private final LottoStore lottoStore;
	private final Message message;
	private final LottoValidator lottoValidator = new LottoValidator();

	private final Util util;

	public LottoController(LottoStore lottoStore, Message message, Util util) {
		this.lottoStore = lottoStore;
		this.message = message;
		this.util = util;
	}

	public void run() {
		lottoStore.buyLotto(purchase());
		lottoStore.submitHitNum(writeHitNum());
	}

	public int purchase() {
		String amountString = "";
		do {
			amountString = message.scanner("구매금액을 입력해 주세요.");
		} while (!lottoValidator.validateAmount(amountString));
		message.printNewLine();
		return Integer.parseInt(amountString);
	}

	private List<Integer> writeHitNum() {
		String hitNums = "";
		do {
			hitNums = message.scanner("당첨 번호를 입력해 주세요.");
		} while (!lottoValidator.validateHitNums(hitNums));
		message.printNewLine();
		return util.stringToIntegerList(hitNums);
	}
}
