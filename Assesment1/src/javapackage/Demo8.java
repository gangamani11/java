package javapackage;
interface I1{
	void near();
}
interface I2{
	void far();
}
interface I3{
	void react();
}
interface I4 extends I1,I2,I3{
	void problem();
}

public class Demo8 implements I4 {
	public void near() {
		System.out.println("starting");
	}
	public void far() {
		System.out.println("stopping");
	}
	public void react() {
		System.out.println("waiting");
	}
	public void go() {
		System.out.println("going");
	}

	public static void main(String[] args) {
		Demo8 d1=new Demo8();
		d1.near();
		d1.far();
		d1.react();
		d1.go();
		

	}

}
