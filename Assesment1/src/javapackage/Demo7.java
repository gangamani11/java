package javapackage  ;   
interface K1{
    	 
	void beach();
}
interface K2{
	void hills();
}
interface K3 extends K1,K2{
	void road();
}
class sunset{
	public void weather() {
		System.out.println("cool");
	}
}

public class Demo7 extends sunset  {
	public void beach() {
		System.out.println("swim");
	}
	public void hill() {
		System.out.println("climb");
	}
	public void road() {
		System.out.println("walk");
	}
	public void air() {
		System.out.println("fly");
	}

	public static void main(String[] args) {
		Demo7
		 d1=new Demo7();
		sunset s1=new sunset();
		s1.weather();
		d1.beach();
		d1.hill();
		d1.road();
		d1.air();
	}
}





