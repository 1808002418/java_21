package com.hwl.twelve;

public class Main {
	public static void main(String[] args) {
		testSwitch();
	}

	private static void testSwitch() {
		/**
		 * 这个是预览功能，如果需要编译和运行的话需要使用下面命令，预览功能在2个版本之后会成为正式版，
		 * 编译:
		 *     javac --enable-preview -source 12 Main.java
		 * 运行：
		 *     java --enable-preview Main
		 * 即如果你使用的是jdk14以上的版本，正常的编译和运行即可。否则需要使用预览功能来编译和运行
		 *
		 * -> 符号右则表达式方法体在执行完分支方法之后，自动结束 switch 分支
		 */
		int month = 3;
		switch (month) {
			case 3,4,5 -> System.out.println("spring");
			case 6,7,8 -> System.out.println("summer");
			case 9,10,11 -> System.out.println("autumn");
			case 12, 1,2 -> System.out.println("winter");
			default -> System.out.println("wrong");
		}
	}
}
