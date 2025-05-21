package practice;
import java.io.*;
public class Test28 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter f1=new FileWriter("C:\\Users\\gopal\\OneDrive\\Desktop\\sem.txt");
		f1.write("hi ganga how are you");
		f1.close();
		System.out.println("succes");

	}

}
