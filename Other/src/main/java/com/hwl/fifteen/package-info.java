package com.hwl.fifteen;
// java11特性
/**
 * 1. 密封类(Sealed Classes)和接口，作用是限制一个类可以由哪些子类继承或者实现。
 *  必须有子类
 *  密封类不支持匿名类与函数式接口
 *  子类的三种形态:
 *      1. 子类由final修饰,表示为最终态类，则指定类已经形成完全密封，所以满足密封保障
 *      2. 子类由sealed修饰, 表示由下游调用方继续提供密封保障.
 *      3. 使用non-sealed关键字对类进行显式的声明其不进行密封，这种情况下由下游调用方承担打破密封的风险
 *  如果指定模块的话，sealed class和其子类必须在同一个模块下。如果没有指定模块，则需要在同一个包下。
 *  sealed class指定的子类必须直接继承该sealed class,在指定允许继承的子类时可以使用全限定名.
 *  sealed class的子类要用final修饰。
 *  sealed class的子类如果不想用final修饰的话，可以将子类声明为sealed class。
 * 2. CharSequence新增的方法
 * 3. TreeMap新增方法
 */