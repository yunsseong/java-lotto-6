package lotto.controller;

import java.util.List;

public interface LottoStore {

	public List<List<Integer>> buyLotto();
	public int purchase();
	public void generateLottoList(int purchaseQuantity);
	public void setHitNumber();
	public void setHitBonusNumber();
	public List<List<Integer>> getGeneratedLottoList();
	public List<Integer> getHitResult();
	public float getReturnOnInvestment();
}
