package Sample;
class Anaimal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Anaimal{
	void bark() {
		System.out.println("dog is barking");
	}
}

public class ex4 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		d1.sleep();		
	}

}
