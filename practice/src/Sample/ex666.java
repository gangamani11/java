package Sample;

public class ex666 {
	void show() {
		System.out.println("hiee");
	}
	class Test23{
		void print() {
			System.out.println("hello");
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex666 ex=new ex666();
		ex.show();
		ex666.Test23 t1=new ex666().new Test23();
				t1.print();

	}

}
