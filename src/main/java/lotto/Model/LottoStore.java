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

	public void submitHitNum(List<Integer> integers) {
	}
}
