package com.hwl.eleven;

public class Main {
	public static void main(String[] args) {
		testStringAPI();
		testLambda();
	}

	private static void testStringAPI() {
		// strip方法，可以去除首尾空格，与之前的trim的区别是还可以去除unicode编码的空白字符
		char c = '\u2000';// unicode空白字符
		String str = c + "abc" + c;
		System.out.println(str.strip());
		System.out.println(str.trim());

		System.out.println(str.stripLeading());// 去除前面的空格
		System.out.println(str.stripTrailing());// 去除后面的空格
		// isBlank方法，判断字符串长度是否为0，或者是否是空格，制表符等其他空白字符
		String str2 = " ";
		System.out.println(str2.isBlank());

		// repeat方法，字符串重复的次数
		String str3 = "monkey";
		System.out.println(str3.repeat(4));

	}

	private static void testLambda() {
		//支持lambda表达式参数中使用var
		MyInterface mi = (var a, var b) -> {
			System.out.println(a);
			System.out.println(b);
		};

		mi.m1("LAMBDA", 1024);
	}
}
