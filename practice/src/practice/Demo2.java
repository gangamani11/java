package practice;

public class Demo2 extends Thread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		
		Thread t1=new Thread(d1);
		t1.start();
		
		System.out.println("hiee");
		try {
		t1.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hloo");
	}

}
