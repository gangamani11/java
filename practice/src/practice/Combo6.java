package practice;

public class Combo6 {


	// DeviceFailureException.java
	class DeviceFailureException extends Exception {
	    public DeviceFailureException(String message) {
	        super(message);
	    }
	}

	// Device.java
	
	    public void use(String deviceName) throws DeviceFailureException {
	        if (deviceName.equalsIgnoreCase("printer1") || deviceName.equalsIgnoreCase("printer3")) {
	            System.out.println("Available");
	        } else {
	            throw new DeviceFailureException("Device failure: Not Available");
	        }
	    }

	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please provide a device name as a command line argument.");
	            return;
	        }

	        String deviceName = args[0];
	        Combo6 d1 = new Combo6();

	        try {
	            d1.use(deviceName);
	        } catch (DeviceFailureException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


