package com.codegnan.collections;

import java.util.Scanner;
import java.util.Vector;

public class Main13 {

	public static int removeFromVector(int n, int i) {
		Vector <Integer> vector = new Vector<>();
		
		for(int j=1; j<=n; j++) {
			vector.add(j);
		}
		
		 return vector.remove(i);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		System.out.println(removeFromVector(n, i));
		sc.close();
	}

}
