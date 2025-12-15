package com.codegnan.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main6 {

	public static int findMiddle(int n) {
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		int midIndex = n/2;
		
		return list.get(midIndex);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findMiddle(n));
		sc.close();
	}

}
