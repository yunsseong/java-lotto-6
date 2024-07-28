package lotto.Controller;

import java.util.List;
import java.util.stream.Collectors;

import lotto.Model.LottoStore;
import lotto.Util.Util;
import lotto.View.Message;

public class LottoController {
	private final LottoStore lottoStore;
	private final Message message;
	private final Validator validator = new Validator();

	private final Util util;

	public LottoController(LottoStore lottoStore, Message message, Util util) {
		this.lottoStore = lottoStore;
		this.message = message;
		this.util = util;
	}

	public void run() {
		lottoStore.buyLotto(purchase());
		lottoStore.submitHitNum(writeHitNum());
		lottoStore.submitBonusNum(writeBonusNum());
		announceResult();
	}

	public int purchase() {
		String amountString = "";
		do {
			amountString = message.scanString("구매금액을 입력해 주세요.");
		} while (!validator.validateAmount(amountString));
		message.printNewLine();
		return Integer.parseInt(amountString);
	}

	private List<Integer> writeHitNum() {
		String hitNums = "";
		do {
			hitNums = message.scanString("당첨 번호를 입력해 주세요.");
		} while (!validator.validateHitNums(hitNums));
		message.printNewLine();
		return util.stringToIntegerList(hitNums);
	}

	private int writeBonusNum() {
		String bonusNum = "";
		do {
			bonusNum = message.scanString("보너스 번호를 입력해 주세요.");
		} while (!validator.validateLottoNum(bonusNum));
		message.printNewLine();
		return Integer.parseInt(bonusNum);
	}

	public void announceResult(){
		List<Integer> hitNumList = lottoStore.getHitNumList().stream().skip(3).collect(Collectors.toList());
		message.printHitResult(hitNumList);
		message.printProfitRatio(lottoStore.getProfitRatio(hitNumList));
	}
}
