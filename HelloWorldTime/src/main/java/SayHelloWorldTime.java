public class SayHelloWorldTime {
	public String sayHWTime(String time) {//morning
		HelloWorld hw = new HelloWorld();
		return hw.sayHello("zs") +","+time;//"Hello zs,morning"
	}
}
