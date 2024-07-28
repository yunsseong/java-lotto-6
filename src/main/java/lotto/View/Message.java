package lotto.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import lotto.Util.Util;

public class Message {
	private List<String> resultMessage = new ArrayList<>(Arrays
		.asList("3개 일치 (5,000원) - ",
		"4개 일치 (50,000원) - ",
		"5개 일치 (1,500,000원) - ",
		"5개 일치, 보너스 볼 일치 (30,000,000원) - ",
		"6개 일치 (2,000,000,000원) - "));
	private final Util util = new Util();

	public void println(String message) {
		System.out.println(message);
	}

	public void printNewLine(){
		System.out.println();
	}

	public void printError(String message) {
		this.println("[ERROR] " + message);
	}

	public String scan(){
		return spaceReplacer(Console.readLine());
	}

	public String scanString(String message) {
		this.println(message);
		return this.scan();
	}

	public String spaceReplacer(String string) {
		return string.replaceAll(" ", "");
	}

	public void printHitResult(List<Integer> resultList) {
		for(int i = 0; i < resultMessage.size(); i++){
			println(resultMessage.get(i) + resultList.get(i) + "개");
		}
	}

	public void printProfitRatio(double profitRatio) {
		System.out.printf("총 수익률은 %.1f%%입니다.%n", profitRatio);
	}
}
