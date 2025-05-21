package practice;

import java.util.*;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "cse");
		m1.put(4, "ece");
		m1.put(3, "eee");
		m1.put(2, "ds");
		m1.put(5, "cs");
		m1.put(null, null);
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
		System.out.println(i.getValue());
		System.out.println(i.getKey());
		

	}

}
}
