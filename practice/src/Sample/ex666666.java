package Sample;
class Demo1{
	void show() {
		System.out.println("hii");
	}
}

public class ex666666 {
	Demo1 d=new Demo1() {
		void show() {
			System.out.println("hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex666666 ex=new ex666666();
		ex.d.show();

	}

}
