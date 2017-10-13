package Honban;

public class CalcExecution {

	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpl();
		int num1 = 1;
		int num2 = 2;
		int addResult = calculator.addNumber(num1, num2);
		int subResult = calculator.subNumber(num1, num2);
		System.out.println(num1+"+"+num2+"="+addResult);
		System.out.println(num1+"-"+num2+"="+subResult);
	}

}
