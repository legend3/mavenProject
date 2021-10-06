

public class SayHelloWorldTime {
	public String sayHWTime(String time) {//morning
		HelloWorld hw = new HelloWorld();//依赖项目HelloWorld2中的类型！
		return hw.sayHello("zs") +","+time;//"Hello zs,morning"
	}
}
