package practice;
import java.io.*;

public class Test27 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\sem.txt");
				if(f1.createNewFile()) {
					System.out.println("file created success");
				}else {
					System.out.println("not created");
				}

	}

}
