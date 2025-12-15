package com.codegnan.collections;

import java.util.Scanner;
import java.util.Stack;

public class Main8 {

	public static int createStackAndGetSize(int n) {
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<n;i++) {
			stack.push(i);
		}
		return stack.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(createStackAndGetSize(n));
		sc.close();
	}

}
