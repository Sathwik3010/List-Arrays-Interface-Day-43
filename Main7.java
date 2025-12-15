package com.codegnan.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main7 {

	public static int addAtEndAndGetSize(int n, int k) {
		List<Integer> list = new LinkedList<>();
		for(int i=0; i<n; i++) {
			list.add(i);
		}
		list.add(k);
		
		return list.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(addAtEndAndGetSize(n,k));
		sc.close();
	}

}
