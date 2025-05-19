package javapackage;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3{
	void mul();
}

public class Demo4 implements I1,I2,I3 {
	public void add() {
		System.out.println("get");
	}
	public void sub() {
		System.out.println("set");
	}
	public void mul() {
		System.out.println("go");
	}
	public void div() {
		System.out.println("finish");
	}

	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();

	}

}
