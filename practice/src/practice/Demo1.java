package practice;
class GangaException extends Exception{
	public GangaException(String message) {
		super(message);
	}
}

public class Demo1 {
	public static void numCheck(int num)throws GangaException{
		if(num%2==0) {
			throw new GangaException("maths ochhu"); 
		}else {
			System.out.println("maths radhu");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			numCheck(12);
		}
		catch(GangaException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("whatever maths is hard");
		}

	}

}
