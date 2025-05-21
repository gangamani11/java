package Sample;
abstract class Test4{
	abstract void sing();
static void play() {
	System.out.println("playing");
}
static void add() {
	System.out.println("adding");
}
void dance() {
	System.out.println("dancing");
}
void draw() {
	System.out.println("drawing");
}
}
class exxxxx333 extends Test4 {
	public void sing() {
		System.out.println("singing");
	}
	 void run() {
		System.out.println("running");
	}
}
class demo4 {
	public static void main(String[] args) {
		exxxxx333 ex=new exxxxx333();{
			ex.sing();
			Test4.play();
			Test4.add();
			ex.dance();
			ex.draw();
			ex.run();
		}
		
	}
	

}


	


