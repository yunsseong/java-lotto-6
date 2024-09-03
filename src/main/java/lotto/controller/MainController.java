package lotto.controller;

import lotto.view.Output;
import lotto.view.OutputImpl;

public class MainController implements Controller{
	private LottoStore lottoStore;
	private Output output;

	@Override
	public void init() {
		this.lottoStore = new LottoStoreImpl();
		this.output = new OutputImpl();
	}

	@Override
	public void runner() {
		output.printLottoList(lottoStore.buyLotto());
	}

	@Override
	public void result() {

	}
}
