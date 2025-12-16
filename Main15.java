package com.codegnan.collections;

import java.util.Scanner;
import java.util.Vector;

public class Main15 {

	public static int sumOfVector(int n) {
		Vector<Integer> vector = new Vector<>();

		for(int i=1; i<=n; i++) {
			vector.add(i);
		}
		
		int sum=0;
		for(int value: vector) {
			sum += value;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumOfVector(n));
		sc.close();
	}

}
