package com.codegnan.collections;

import java.util.Scanner;
import java.util.Stack;

public class Main9 {

	public static int popFromStack(int n) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=n; i++) {
			stack.push(i);
		}
		
		return stack.pop();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(popFromStack(n));
		sc.close();
	}

}
