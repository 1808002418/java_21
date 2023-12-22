package com.hwl.fourteen;

public record PersonRecord(String id, String name, String idCard) {

	private void test1() {
		System.out.println("test1");
	}

	public void test2() {
		test1();
		System.out.println("test2");
	}

	public static void test3() {
		System.out.println("test3");
	}

	@Override
	public String id() {
		return "Override: " + id;
	}

}
