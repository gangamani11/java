package Mypackage;


	import java.util.Scanner;

	public class Combo4 {

		  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an integer as a string: ");
		        String input = scanner.nextLine();

		        try {
		            int parsedInt = Integer.parseInt(input);
		            System.out.println("Parsed integer: " + parsedInt);
		        } catch (NumberFormatException e) {
		            System.out.println("Error: The input is not a valid integer.");
		        }

		        scanner.close();
		    }
		}

	
