package practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile1 {

	public static void main(String[] args) {
		try
		{
			File Obj=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\sem.txt");
			Scanner R=new Scanner(Obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
		}catch(FileNotFoundException e) {
			System.out.println("an error has occured.");
			e.printStackTrace();
		}
	}

}
