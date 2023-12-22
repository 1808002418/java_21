import com.hwl.impl.LoginListener;
import com.hwl.inter.exports.IEventListener;

module impl.module {
	exports com.hwl.impl;
//	transitive 关键词表示传递依赖，比如模块 A 依赖模块 B，模块 B 传递依赖模块 C，那么模块 A 就会自动依赖模块 C，类似于 Maven
//	导入本模块就会自动依赖我的依赖
//	requires static N语句意味着模块M取决于模块N，模块N必须在编译时出现才能编译模块M，而在运行时存在模块N是可选的
	requires static transitive inter.module;
	provides IEventListener with LoginListener;
}