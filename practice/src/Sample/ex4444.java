package Sample;
class ex123{
	public ex123() {
		System.out.println("hi");
	}
int x=99;
void print() {
	System.out.println("hello");
}
}
public class ex4444 extends ex123{
	public ex4444() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	

	public static void main(String[] args) {
		ex4444 ex=new ex4444();
		ex.show();
		

	}

}
