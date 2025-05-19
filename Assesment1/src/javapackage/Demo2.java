package javapackage;
interface In1{
	void run();
}
interface In2{
	void walk();
}
class Sample implements In2{
	public void run() {
		System.out.println("running");
	}
	public void walk() {
		System.out.println("walking");
	}
	public void sing() {
		System.out.println("singing");
	}
}
public class Demo2 implements In2 {
	public void run() {
		System.out.println("running");
		
	}
	public void walk() {
		System.out.println("walking");
	}
	public void dance() {
		System.out.println("dancing");
	}

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		Sample s1=new Sample();
		d1.run();
		d1.walk();
		d1.dance();
		s1.sing();
		

	}

}
