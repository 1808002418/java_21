package com.hwl.nine;
// java9特性
/**
 * 1. 接口方法私有化
 * 2. 改进了try-with-resources语句
 * 3. 不能使用下划线命名变量,_将变成关键字
 * 4. String字符串的变化
 *  在以前的版本中String内部使用了char数组存储，对于使用英语的人来说，字符用一个字节就能存储，
 *  因此在jdk9中将String内部的char数组改成了byte数组，这样就节省了一半的内存占用。
 *  String中增加了一个判断，倘若字符超过1个字节的话，会把byte数组的长度改为两倍char数组的长度，用两个字节存放一个char。
 *  在获取String长度的时候，其源码中有向右移动1位的操作（即除以2），这样就解决了上面扩容2倍之后长度不正确的问题。
 * 5. 模块化
 */