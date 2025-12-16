package com.codegnan.collections;

import java.util.Scanner;
import java.util.Stack;

public class Main12 {

	public static int stackSizeAfterOperations(int n, int m) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=n; i++) {
			stack.push(i);
		}
		
		for(int i=0; i<m; i++) {
			stack.pop();
		}
		return stack.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(stackSizeAfterOperations(n,m));
		sc.close();
	}

}
