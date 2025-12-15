package com.codegnan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	public static int createListAndGetSize(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n; i++) {
			list.add(i);
		}
		
		return list.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(createListAndGetSize(n));
		sc.close();
	}

}
