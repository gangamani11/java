package practice;

public class Combo2 {

	class InvalidEmployeeIDException extends Exception {
	    public InvalidEmployeeIDException(String message) {
	        super(message);
	    }
	}

	public class set1{
	    public static void main(String[] args) {
	        // Check if command-line argument is provided
	        if (args.length == 0) {
	            System.out.println("Please provide an employee ID as a command-line argument.");
	            return;
	        }

	        try {
	            // Parse the command-line argument to an integer
	            int employeeID = Integer.parseInt(args[0]);

	            // Validate the employee ID
	            validateEmployeeID(employeeID);

	            // If ID is valid, print success message
	            System.out.println("Valid Employee ID");
	        } catch (InvalidEmployeeIDException e) {
	            // Catch custom exception and print error message
	            System.out.println("Exception caught: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            // Catch invalid input and print error message
	            System.out.println("Invalid input. Please enter a valid integer.");
	        }
	    }

	    // Method to validate employee ID
	    public static void validateEmployeeID(int employeeID) throws InvalidEmployeeIDException {
	        // Check if ID is within valid range (0-999)
	        if (employeeID < 0 || employeeID > 999) {
	            // Throw custom exception if ID is invalid
	            throw new InvalidEmployeeIDException("Invalid Employee ID");
	        }
	    }
	}

}