package com.codegnan.collections;

import java.util.Scanner;
import java.util.Vector;

public class Main14 {

	public static boolean containsInVector(int n, int k) {
		Vector<Integer> vector = new Vector<>();
		
		for(int i=1; i<=n; i++) {
			vector.add(i);
		}
		
		return vector.contains(k);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(containsInVector(n,k));
		sc.close();
	}

}
