package com.codegnan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static boolean containsElement(int n, int k) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		return list.contains(k);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(containsElement(n,k));
		sc.close();
	}

}
