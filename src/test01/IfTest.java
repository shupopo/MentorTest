package test01;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = -10, n2 = 10, n3 = 0;
	    n2 = n1;
	    n3 = n2;
	    n1 = n3;
	    if (n1 > 0)
	      System.out.println("x");
	    else if ( n1 < 0)
	      System.out.println("y");
	    else
	      System.out.println("z");
	}

}
