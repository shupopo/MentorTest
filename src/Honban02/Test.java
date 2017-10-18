package Honban02;

public class Test {
	private static int a;
	private int b;
	
	public static int countUpA(){
		return ++a;
	}
	
	public static int doMethod(){
		return countUpA();
	}
	
	public static void main(String[]args){
		//Test test = new Test();
		System.out.print(doMethod());
		System.out.print(" "+ countUpA());
	}
}
