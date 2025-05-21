package practice;


	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class Combo3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter the value of 'a': ");
	            int a = scanner.nextInt();

	            System.out.print("Enter the value of 'b': ");
	            int b = scanner.nextInt();

	            int result = a / b;
	            System.out.println("Result of a/b: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception: / by zero");
	        } catch (InputMismatchException e) {
	            System.out.println("Input Mismatch Exception: Please enter valid integer values.");
	            scanner.next(); // Clear invalid input
	        } finally {
	            scanner.close();
	        }
	    }
	}


