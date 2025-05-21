package practice;

public class Test1 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Thread t2=new Thread(t1);
		System.out.println("hello");
		t2.start();
		
	}
}