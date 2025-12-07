package com.codegnan.collections;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsExamples {

	public static void main(String[] args) {

		Vector<Integer> v= new Vector<>();
		for(int i=1; i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration<Integer>e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
	}

}
