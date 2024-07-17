package lotto.View;

import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;
import lotto.Util.Util;

public class Message {

	public void println(String message) {
		System.out.println(message);
	}

	public void printNewLine(){
		System.out.println();
	}

	public void printError(String message) {
		this.println("[ERROR] " + message);
	}

	public String scanner(String message) {
		this.println(message);
		return spaceReplacer(Console.readLine());
	}

	public String spaceReplacer(String string) {
		return string.replaceAll(" ", "");
	}
}
