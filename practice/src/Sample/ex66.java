package Sample;
class Test1{
	 void show() {
		System.out.println("hi");
	}
}

public class ex66 extends Test1 {
	void show() {
		int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex66 ex=new ex66();
		ex.show();
		

	}

}
