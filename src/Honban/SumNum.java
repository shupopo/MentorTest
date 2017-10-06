package Honban;

class SumNum {
	public static void main(String[] args) {
		int input1;
		int input2;
		try {
			input1 = Integer.parseInt(args[0]);
			input2 = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("入力された引数は整数ではありません。");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("引数を２つ入力してください");
			return;
		}
		int result = 0;
		String displayResult = "";
		for (int i = input1; i < input2 + 1; i++) {
			result += i;
			if (i != input2) {
				displayResult += i + "+";
			} else {
				displayResult += i + "=";
			}
		}
		System.out.println(displayResult + result);
	}
}