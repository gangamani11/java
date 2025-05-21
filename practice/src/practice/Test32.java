package practice;

import java.util.LinkedList;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(34);
		l1.add(45);
		l1.add(56);
		l1.add(77);
		System.out.println(l1);
		l1.addFirst(67);
		l1.add(3,98);
		l1.addLast(44);
		System.out.println(l1);
		l1.removeLast();
		l1.removeFirst();
		l1.removeFirstOccurrence(45);
		l1.removeLastOccurrence(77);
		System.out.println(l1);
	}

}
