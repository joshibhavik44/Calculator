package Tests;

public class UnitTesting {

		public static int add(int a, int b) {
			System.out.println("Addition of (" + a + " + " + b + ") = "+(a+b));
			return a+b;
			
		}
		public static int sub(int a, int b) {
			System.out.println("Substraction of (" + a + " - " + b + ") = "+(a-b));
			return a-b;
		}	
		public static int mul(int a, int b) {
			System.out.println("Multiplication of (" + a + " x " + b + ") = "+(a*b));
			return a*b;
		}	
		public static double div(double a, double b) {
			if(b==0) {throw new IllegalArgumentException("Number can't be divided by 0");}
		else{System.out.println("Dividion of (" + a + " / " + b + ") = "+(a/b));
			return a/b;
		}
	}

}
