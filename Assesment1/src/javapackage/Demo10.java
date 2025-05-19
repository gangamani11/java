package javapackage;
interface I1{
	void hospital();
}
interface I2{
	void icu();
}
interface I3{
	void emergency();
}
class start1 implements I1 {
	public void hospital() {
		System.out.println("doctor");
	}
	public void patient() {
		System.out.println("sick");
	}}
class fast implements I2 {
	
		public void icu() {
			System.out.println("treatment");
		}
		public void ward() {
			System.out.println("wheelchair");
		}}
public class Demo10 implements I3{
	
		public void emergency() {
			System.out.println("operation");
		}
		public void firstaid() {
			System.out.println("accident");
		}


	public static void main(String[] args) {
		Demo10 d1=new Demo10();
		fast f=new fast();
		start1 d=new start1();
		d.hospital();
		d.patient();
		f.icu();
		f.ward();
		d1.emergency();
		d1.firstaid();
		// TODO Auto-generated method stub

	}

}
