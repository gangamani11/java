package Sample;

public class ex111 {
	int b=5;
	static int r=5,a=5;
	void cir() {
		System.out.println(3.14*r*r);
		System.out.println(b*b);
	}
	static void rec() {
		int e=6,d=7;
		System.out.println(r*a);
		System.out.println(0.5*e*d);
	}
	
	public static void main(String[] args) {
		ex111 t1=new ex111();
		t1.cir();
		rec(); 

	}

}
