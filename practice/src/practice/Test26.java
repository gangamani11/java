package practice;

public class Test26  extends Thread{
	String s;
	public Test26(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+ " is Demom Thread");
		}else {
			System.out.println(s+"user Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test26 Thread1=new Test26("Thread1");
		Test26 Thread2=new Test26("Thread2");
		Test26 Thread3=new Test26("Thread3");
		Thread1.setDaemon(true);
		Thread1.start();
		Thread2.start();
		Thread3.setDaemon(false);
		Thread3.start();

	}

}
