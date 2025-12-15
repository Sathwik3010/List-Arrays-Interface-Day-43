package com.codegnan.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

	public static int reverseAndGetFirst(int n) {
		List<Integer> list = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		Collections.reverse(list);
		
		return list.getFirst();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(reverseAndGetFirst(n));
		sc.close();
	}

}
