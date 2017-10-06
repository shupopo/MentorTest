package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("n = ");
		String input = br.readLine();
		int inputNum = Integer.valueOf(input);
		long result = fibonacci(inputNum);
		System.out.println("フィボナッチ数列の第" + inputNum + "項は" + result + "です。");
	}

	private static long fibonacci(int n) {
		long a = 1;
		long b = 1;
		long c = 0;
		if (n < 3) {
			c = 1;
		} else {
			for (int i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		return c;
	}
}
