//https://juejin.cn/post/6847902216590721031
module inter.module {
//	导出模块内的哪些包（允许直接 import 使用）
	exports com.hwl.inter.exports;
//	开放模块内的哪些包（允许通过 Java 反射访问）
	opens com.hwl.inter.internal;
//	依赖哪些模块
	requires java.xml;
//	声明模块提供的 Java SPI 服务，一次可以声明多个服务实现类（逗号分隔）。
	provides com.hwl.inter.exports.IEventListener with com.hwl.inter.internal.InternalEchoListener;

}