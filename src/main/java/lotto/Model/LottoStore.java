package lotto.Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.View.Message;

public class LottoStore {
	private List<Lotto> lottoList = new ArrayList<>();
	private Message message = new Message();

	public void validateLottoAmount(String amountString) {
		int amount = Integer.parseInt(amountString);
		if (amount < 0)
			throw new IllegalArgumentException("구매 금액은 0보다 작을 수 없습니다.");
		if (amount < 1000)
			throw new IllegalArgumentException("최소 구매 금액은 1000원 이상입니다.");
	}

	public void buyLotto(int amount) {
		int quantity = amount / 1000;
		message.println(quantity + "개를 구매했습니다.");
		for (int i = 0; i < quantity; i++) {
			List<Integer> lottoNum = generateLotto();
			message.println(lottoNum.toString());
			lottoList.add(new Lotto(lottoNum));
		}
	}

	private List<Integer> generateLotto() {
		HashSet<Integer> lottoSet = new HashSet<>();
		do {
			lottoSet.add(Randoms.pickNumberInRange(1, 45));
		} while (lottoSet.size() != 6);
		List<Integer> lottoList = new ArrayList<>(lottoSet.stream().toList());
		lottoList.sort(Comparator.naturalOrder());
		return lottoList;
	}
}
