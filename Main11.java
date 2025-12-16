package com.codegnan.collections;

import java.util.Scanner;
import java.util.Stack;

public class Main11 {

	public static int pushAndGetTop(int n, int k) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=n; i++) {
			stack.push(i);
		}
		stack.push(k);
		
		return stack.peek();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(pushAndGetTop(n,k));
		sc.close();
	}

}
