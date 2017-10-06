package Honban;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int num1 = 1;
		int num2 = 2;
		int addResult = calculator.addNumber(num1, num2);
		int subResult = calculator.subNumber(num1, num2);
		System.out.println("１+2="+addResult);
		System.out.println("１-2="+subResult);
	}

}
