package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.model.Lotto;
import lotto.model.Purchase;
import lotto.view.Input;
import lotto.view.InputImpl;
import lotto.view.Output;
import lotto.view.OutputImpl;

public class LottoStoreImpl implements LottoStore{
	private List<Lotto> generatedLottoList = new ArrayList<>();
	private final Input input;
	private final Output output;

	public LottoStoreImpl() {
		this.input = new InputImpl();
		this.output = new OutputImpl();
	}

	public List<List<Integer>> buyLotto() {
		int purchaseQuantity = purchase();
		generateLottoList(purchaseQuantity);
		return getGeneratedLottoList();
	}

	@Override
	public int purchase() {
		output.printBuyAmountMessage();
		Purchase purchase = null;
		do {
			try{
				purchase = new Purchase(input.getSingleNumber());
			} catch (IllegalArgumentException e) {
				output.printExceptionMessage(e.getMessage());
			}
		} while (purchase == null);
		output.printBuyAmount(purchase.getPurchaseQuantity());
		return purchase.getPurchaseQuantity();
	}

	@Override
	public void generateLottoList(int purchaseQuantity) {
		  this.generatedLottoList = Stream
			 .generate(() -> new Lotto(generateLottoNumber()))
			 .limit(purchaseQuantity)
			 .collect(Collectors.toList());
	}

	private List<Integer> generateLottoNumber() {
		return Randoms.pickUniqueNumbersInRange(1, 45, 6)
			.stream()
			.sorted()
			.collect(Collectors.toList());
	}

	@Override
	public List<List<Integer>> getGeneratedLottoList() {
		return generatedLottoList.stream()
			.map(Lotto::getNumbers)
			.collect(Collectors.toList());
	}



	@Override
	public void setHitNumber() {
	}

	@Override
	public void setHitBonusNumber() {

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
