package Honban;

public class Calculator implements CalcPlan {

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
