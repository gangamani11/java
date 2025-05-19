package javapackage;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}

public class Demo1 implements I3{
	public void add() {
	System.out.println("heyyy");
	}
public void sub() {
	System.out.println("hieee");
}
public void mul() {
	System.out.println("hiii");
}
public void div() {
	System.out.println("hello");
}


	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}
	
	

	}


