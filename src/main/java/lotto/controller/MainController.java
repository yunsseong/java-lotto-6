package lotto.controller;

public class MainController implements Controller{
	private LottoStore lottoStore;

	@Override
	public void init() {
		this.lottoStore = new LottoStoreImpl();
	}

	@Override
	public void runner() {
		lottoStore.buyLotto();
	}

	@Override
	public void result() {

	}
}
