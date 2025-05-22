package Mypackage;

public class Combo9 {
		static void exc(int a) {
			if(a<0||a>100) {
				throw new ArithmeticException("Invalid age");
			}
			else {
				System.out.println("Valid Age entered");
			}
			System.out.println(a);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int age=Integer.parseInt(args[0]);
			try {
			   exc(age);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		}

	}