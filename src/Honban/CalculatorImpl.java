package Honban;

public class CalculatorImpl implements Calculator {

	@Override
	public int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	@Override
	public int subNumber(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

}
