package com.codegnan.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String>s = new Stack<>();
		s.push("AAA");
		s.push("BBB");
		s.push("CCC");
		s.push("DDD");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search("AAA"));
	}

}
