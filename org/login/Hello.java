package org.login;

public class Hello {
	public static void main(String[] args) {
		String s = "java";
		System.out.println(System.identityHashCode(s));
		String s1 = "java";
		System.out.println(System.identityHashCode(s1));
		String s2 = new String("java");
		System.out.println(System.identityHashCode(s2));
		if (s == s2) {
			System.out.println("string are same");
		} else {
			System.out.println("string are not same");
		}
		if (s.equals(s2)) {
			System.out.println("same string");

		} else {
			System.out.println("not same string");
		}
	}

}
