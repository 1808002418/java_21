package com.hwl.fourteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
//		testInstance();
//		testNullPointer();
//		testRecord();
		testStringBlock();
	}

	private static void testStringBlock() {
		/**
		 * \:行终止符，主要用于阻止插入换行符；
		 * \s:表示一个空格。可以用来避免末尾的白字符被去掉
		 */
		// 等价于format("12")
		String s1 = """
				1\
				2
				""";
		// 等价于format("1 \n2")
		String s2 = """
				1\s
				2
				""";
		System.out.println(s1);
		System.out.println(s2);
	}

	private static void testRecord() {
		/**
		 * 这个是预览功能，如果需要编译和运行的话需要使用下面命令，预览功能在2个版本之后会成为正式版，
		 * 编译:
		 *     javac --enable-preview -source 14 Main.java
		 * 运行：
		 *     java --enable-preview Main
		 * 即如果你使用的是jdk16以上的版本，正常的编译和运行即可。否则需要使用预览功能来编译和运行
		 */
		PersonRecord.test3();
		PersonRecord record = new PersonRecord("1,", "张三", "123");
		record.test2();
		/**
		 * Java 14 中为了引入 Record 这种新的类型，在 java.lang.Class 中引入了下面两个新方法：
		 * getRecordComponents() 方法返回一组 java.lang.reflect.RecordComponent 对象组成的数组，
		 * java.lang.reflect.RecordComponent也是一个新引入类，该数组的元素与 Record 类中的组件相对应，其顺序与在记录声明中出现的顺序相同，可以从该数组中的每个 RecordComponent 中提取到组件信息，包括其名称、类型、泛型类型、注释及其访问方法。
		 *
		 * 而 isRecord() 方法，则返回所在类是否是 Record 类型，如果是，则返回 true
		 */
		System.out.println(record.getClass().isRecord());
		System.out.println(Arrays.toString(record.getClass().getRecordComponents()));
		System.out.println(record.id());
		System.out.println(record.idCard());
	}

	private static void testNullPointer() {
		final String key="key";
		List<Map<String, String>> test = Collections.singletonList(
				Collections.<String, String>singletonMap(key, null)
		);
		// Cannot invoke "String.equals(Object)" because the return value of "java.util.Map.get(Object)" is null
		test.get(0).get(key).equals(key);
	}

	private static void testInstance() {
		/**
		 * 这个是预览功能，如果需要编译和运行的话需要使用下面命令，预览功能在2个版本之后会成为正式版，
		 * 编译:
		 *     javac --enable-preview -source 14 Main.java
		 * 运行：
		 *     java --enable-preview Main
		 * 即如果你使用的是jdk16以上的版本，正常的编译和运行即可。否则需要使用预览功能来编译和运行
		 */
		Object i= Integer.valueOf(1);
		if (i instanceof Integer value) {
			System.out.println(value.byteValue());
		}
	}
}
