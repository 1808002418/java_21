package com.hwl.fourteen;
// java14特性
/**
 * 1. instanceof模式匹配
 * 2. 友好的空指针（NullPointerException）提示
 * 3. record类型  构造函数形参和字段是一致的
 *  状态描述中的每个组件都有对应的private final字段。
 *  状态描述中的每个组件都有对应的public访问方法。方法的名称与组件名称相同。
 *  一个包含全部组件的公开构造器，用来初始化对应组件。
 *  实现了equals()和hashCode()方法。equals()要求全部组件都必须相等。
 *  实现了toString()，输出全部组件的信息。
 *  4. 文本块再次增强. \和\s符号
 */


/** 3. 反编译代码
 * javap -p -private -classpath E:\code\java_21\Other\target\classes com.hwl.fourteen.PersonRecord
 * Compiled from "PersonRecord.java"
 * public final class com.hwl.fourteen.PersonRecord extends java.lang.Record {
 *   private final java.lang.String id;
 *   private final java.lang.String name;
 *   private final java.lang.String idCard;
 *   public com.hwl.fourteen.PersonRecord(java.lang.String, java.lang.String, java.lang.String);
 *   private void test1();
 *   public void test2();
 *   public static void test3();
 *   public java.lang.String id();
 *   public final java.lang.String toString();
 *   public final int hashCode();
 *   public final boolean equals(java.lang.Object);
 *   public java.lang.String name();
 *   public java.lang.String idCard();
 * }
 */