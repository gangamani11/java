package Sample;
interface I1{
	abstract void add();
	void sub();
}
public class Test35 implements I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Test35 t1=new Test35();
		t1.add();
		t1.sub();
	}

}
