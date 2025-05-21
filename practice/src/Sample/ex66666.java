package Sample;
 class inner {
	 private static void show() {
		System.out.println("hiee");
	}
	static class Test2{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
	
}
	
public class ex66666{
	public static void main(String[] args) {
		inner.Test2.print();
		
	}
	
}



