package javapackage;
interface In1{
	void lily();
}
class Rose{
	public void color() {
		System.out.println("red");
	}
}
class flower extends Rose implements In1{
	public void lily() {
		System.out.println("lilies");
	}
	public void sunflower() {
		System.out.println("sunflowering");
	}
}
public class Demo3 extends flower {
	public void price() {
		System.out.println("rs 100");
	}

	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		d1.color();
		d1.lily();
		d1.sunflower();
		d1.price();

	}

}
