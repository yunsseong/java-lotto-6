package lotto.controller;

import java.util.List;

import lotto.model.Purchase;
import lotto.view.Input;
import lotto.view.InputImpl;
import lotto.view.Output;
import lotto.view.OutputImpl;

public class LottoStoreImpl implements LottoStore{
	private Purchase buyAmount;
	private final Input input;
	private final Output output;

	public LottoStoreImpl() {
		this.input = new InputImpl();
		this.output = new OutputImpl();
	}

	@Override
	public void purchase() {
		output.printBuyAmountMessage();
		do {
			try{
				this.buyAmount = new Purchase(input.getSingleNumber());
			} catch (IllegalArgumentException e) {
				output.printExceptionMessage(e.getMessage());
			}
		} while (buyAmount == null);
		output.printBuyAmount(buyAmount.getPurchaseQuantity());
	}

	@Override
	public void setHitNumber() {

	}

	@Override
	public void setHitBonusNumber() {

	}

	@Override
	public int getLottoAmount() {
		return 0;
	}

	@Override
	public List<Integer> getGeneratedLottoNumber() {
		return null;
	}

	@Override
	public List<Integer> getHitResult() {
		return null;
	}

	@Override
	public float getReturnOnInvestment() {
		return 0;
	}
}
