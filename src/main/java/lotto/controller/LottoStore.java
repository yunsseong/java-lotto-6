package lotto.controller;

import java.util.List;

public interface LottoStore {

	public void purchase();
	public void setHitNumber();
	public void setHitBonusNumber();
	public int getLottoAmount();
	public List<Integer> getGeneratedLottoNumber();
	public List<Integer> getHitResult();
	public float getReturnOnInvestment();
}
