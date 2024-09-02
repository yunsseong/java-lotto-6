package lotto.controller;

import java.util.List;

import lotto.model.Lotto;

public interface LottoStore {

	public void buyLotto();
	public void setHitNumber();
	public void setHitBonusNumber();
	public int getLottoAmount();
	public List<Integer> getGeneratedLottoNumber();
	public List<Integer> getHitResult();
	public float getReturnOnInvestment();
}
