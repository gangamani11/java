package Sample; 

class ManiException extends Exception{
	public ManiException(String message) {
		super(message);
	}
}
public class Demo {
	public  static void ageCheck(int age) throws maniException {
		if(age>18) {
			throw new maniException("nenu cheppanu");
		}else {
			System.out.println("na age 18 below");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ageCheck(12);
		}catch(ManiException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy coding");
		}

	}

}
