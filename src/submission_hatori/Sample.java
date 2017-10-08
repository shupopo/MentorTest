package submission_hatori;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number");
		Integer input = scan.nextInt();
		int a = 1;
		int b = 1;
		int c = 2;
		
		if(input == 1 || input == 2){
			System.out.println("1");
		}else if(input == 3){
			System.out.println("2");
		}else{
			for(int i = 3; i < input; i++){
				 a = b;
				 b = c;
				 c = a + b;
			}
			System.out.println(c);
		}
		
	}
}

