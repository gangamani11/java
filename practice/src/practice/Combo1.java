package practice;

public class Combo1 {
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        
	        try {
	            int index = Integer.parseInt(args[0]);
	            System.out.println("The element present at " + index + " is " + array[index]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("The mentioned index is out of bounds");
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid integer.");
	        }
	    }
	}

