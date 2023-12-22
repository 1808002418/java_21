package com.hwl.thirteen;

public class Main {
	public static void main(String[] args) {
		testSwitch();
		testTextBlock();
	}

	private static void testTextBlock() {
		// 等价于format("1\n2\n3\n4\n5\n")
		/**
		 * java14的
		 * \：行终止符，主要用于阻止插入换行符；
		 * \s：表示一个空格。可以用来避免末尾的白字符被去掉
		 */
		String s = """
				1
				2
				3
				4
				5
				""";
		System.out.println(s);
	}

	private static void testSwitch() {
		/**
		 * 这个是预览功能，如果需要编译和运行的话需要使用下面命令，预览功能在2个版本之后会成为正式版，
		 * 编译:
		 *     javac --enable-preview -source 13 Main.java
		 * 运行：
		 *     java --enable-preview Main
		 * 即如果你使用的是jdk15以上的版本，正常的编译和运行即可。否则需要使用预览功能来编译和运行
		 */
		int month = 1;
		String result = switch (month) {
			case 3, 4, 5 -> "spring";
			case 6, 7, 8 -> "summer";
			case 9, 10, 11 -> "autumn";
			case 12, 1, 2 -> "winter";
			default -> "wrong";
		};
		// 另一种写法. 同时在使用 yield 时，需要有 default 条件
		result = switch (month) {
			case 3, 4, 5:
				yield "spring";
			case 6, 7, 8:
				yield "summer";
			case 9, 10, 11:
				yield "autumn";
			case 12, 1, 2:
				yield "winter";
			default:
				yield "wrong";
		};

		System.out.println(result);
	}
}
