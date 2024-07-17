package lotto;

import lotto.Controller.LottoController;
import lotto.Model.LottoStore;
import lotto.Util.Util;
import lotto.View.Message;

public class Application {

	public static void main(String[] args) {
		LottoController lottoController = new LottoController(new LottoStore(), new Message(), new Util());
		lottoController.run();
	}
}
