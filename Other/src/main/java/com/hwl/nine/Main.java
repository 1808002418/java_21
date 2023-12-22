package com.hwl.nine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sayHi();
	}

	private static void tryWithResources() throws FileNotFoundException {
		FileInputStream stream1 = new FileInputStream(new File(""));
		FileInputStream stream2 = new FileInputStream(new File(""));
		/*
			改进了try-with-resources语句，可以在try外进行初始化，在括号内引用，即可实现资源自动关闭
		 */
		try (stream1; stream2) {
		} catch (Exception ignored) {
		}

	}
}
