package com.codegnan.collections;

import java.util.Scanner;
import java.util.Stack;

public class Main10 {

	public static boolean containsElement(int n, int k) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=n;i++) {
			stack.push(i);
		}
		
		return stack.contains(k);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(containsElement(n,k));
		sc.close();
	}

}
