package com.codegnan.collections;

import java.util.Collections;
//import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 LinkedList<Integer> list = new LinkedList<>();

		int n = sc.nextInt();
		for(int i=0;i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.reverse(list);
		
		
		ListIterator<Integer> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
			if(it.hasNext())
				System.out.print(" ");
		}
		 sc.close();
	}

}
