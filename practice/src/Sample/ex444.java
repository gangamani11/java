package Sample;

public class ex444 {
	void show() {
		System.out.println("hi");
	}
	void show(int a) {
		System.out.println(a);
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(int a,int b,double d1) {
		System.out.println(a+b-d1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex444 ex=new ex444();
		ex.show();
		ex.show(22);
		ex.show(5,6);
		ex.show(2,5,6);

	}

}
