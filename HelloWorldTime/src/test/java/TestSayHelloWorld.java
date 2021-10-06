import org.junit.Test;//依赖HelloWorld2项目打包中的test

import static org.junit.Assert.assertEquals;

public class TestSayHelloWorld {

	@Test
	public void testSayHWTime() {
		SayHelloWorldTime shw = new SayHelloWorldTime();
		String result = shw.sayHWTime("morning") ;//Hello zs,morning
		assertEquals("Hello zs,morning", result);
	}
}
