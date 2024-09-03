package lotto.view;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.Validate;

public class InputImpl implements Input{

	Validate validate = new Validate();

	@Override
	public String getInput() {
		return Console.readLine();
	}

	@Override
	public List<Integer> getMultiNumber() {
		return null;
	}

	@Override
	public int getSingleNumber() {
		String input = getInput();
		if(Validate.isNumber(input))
			return Integer.parseInt(input);
		throw new IllegalArgumentException(ExceptionMessage.NOT_INT_TYPE_INPUT);
	}
}
