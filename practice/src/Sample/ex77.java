package Sample;
import java.util.*;
import java.io.*;
public class ex77 {
	
public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File Obj=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\sample.java");
		Scanner Reader=new Scanner(Obj);
		while(Reader.hasNextLine()) {
			String data=Reader.nextLine();
			System.out.println(data);
		}
		Reader.close();
		

	}

}
