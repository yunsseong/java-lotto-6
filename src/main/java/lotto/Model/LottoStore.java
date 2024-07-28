package lotto.Model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.View.Message;

public class LottoStore {
	private List<Lotto> lottoList = new ArrayList<>();
	private Message message = new Message();
	private List<Integer> hitNumList = new ArrayList<>();
	private int bonusNum;
	private List<Integer> hitProfit = new ArrayList<>(Arrays.asList(5000, 500000, 1500000, 30000000, 2000000000));
	private int amount;

	public void buyLotto(int amount) {
		this.amount = amount;
		int quantity = amount / 1000;
		message.println(quantity + "개를 구매했습니다.");
		for (int i = 0; i < quantity; i++) {
			List<Integer> lottoNum = generateLotto();
			message.println(lottoNum.toString());
			lottoList.add(new Lotto(lottoNum));
		}
		message.printNewLine();
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

	public void submitHitNum(List<Integer> hitNumList) {
		this.hitNumList = hitNumList;
	}

	public void submitBonusNum(int bonusNum) {
		this.bonusNum = bonusNum;
	}

	public List<Integer> getHitNumList() {
		List<Integer> hitCountList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0));
		for (Lotto lotto : lottoList) {
			int hitCount = lotto.getHitCount(hitNumList, bonusNum);
			hitCountList.set(hitCount, hitCountList.get(hitCount) + 1);
		}
		return hitCountList;
	}

	public double getProfitRatio(List<Integer> hitNumList) {
		int profit = 0;
		for (int i = 0; i < hitNumList.size(); i++) {
			profit += (hitNumList.get(i) * hitProfit.get(i));
		}
		return (double)((double)Math.round((double)profit / (double)amount * 100 * 10) / (double)10);
	}
}
