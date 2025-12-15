package com.codegnan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static int insertAndGetSize(int n, int i, int k) {
		List<Integer> list = new ArrayList<>();
		
		for(int num = 1; num<=n; num++) {
			list.add(num);
		}
		
		list.add(i,k);
		
		return list.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(insertAndGetSize(n, i, k));
		sc.close();
	}

}
