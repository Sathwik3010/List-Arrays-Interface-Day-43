package com.codegnan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

	public static int removeFirstElement(int n) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		return list.removeFirst();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(removeFirstElement(n));
		sc.close();
	}

}
