package Sample;

public class ex1 {
	int a=10,b=20;
	static int c=30,d=40;
	void div() {
		int e=60,f=80;
		System.out.println(e/f);
	}

	public static void main(String[] args) {
		ex1 e=new ex1();
		System.out.println(ex1.c*ex1.d);
		System.out.println(e.a%e.b);
		e.div();
	
	}

}
