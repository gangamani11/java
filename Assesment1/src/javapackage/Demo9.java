package javapackage;
interface L1{
	void Summer();
}
interface L2{
	void winter();
}
interface L3{
	void rainy();
}
interface L4{
	void spring();
}
class seasons implements L1,L2,L3{
	public void summer() {
		System.out.println("hot");
	}
	public void winter() {
		System.out.println("cool");
	}
	public void rainy() {
		System.out.println("water");
	}
	public void whirl() {
		System.out.println("whirling");
	}
	
}
public class Demo9 extends seasons implements L4 {
	public void spring() {
		System.out.println("snow");
	}
	public void weather() {
		System.out.println("warm");
	}

	public static void main(String[] args) {
		Demo9 d=new Demo9();
		seasons s=new seasons();
		s.summer();
		s.winter();
		s.rainy();
		s.whirl();
		d.spring();
		d.weather();
		
		
		

	}

}
