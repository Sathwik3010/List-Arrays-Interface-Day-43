package com.codegnan.collections;

import java.util.Scanner;
import java.util.Stack;

public class Main18 {

	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();

		for(char ch: s.toCharArray()) {
			
			if(ch=='(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				
				if((ch==')' && top !='(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {

                    return false;
				}
			}
		}
        return stack.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(isBalanced(input));
        sc.close();
		
	}

}
