import com.hwl.inter.exports.IEventListener;

module application {
//	声明模块依赖的 Java SPI 服务，加上之后模块内的代码就可以通过 ServiceLoader.load(Class) 一次性加载所声明的 SPI 服务的所有实现类
	uses IEventListener;
	requires impl.module;
}