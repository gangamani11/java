package Sample;

public class ex6 extends Object {
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex6 ex=new ex6();
		ex.sub();

	}

}
