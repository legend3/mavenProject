import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSayHelloWorld {
	
	@Test
	public void testSayHWTime() {
		SayHelloWorldTime shw = new SayHelloWorldTime();
		String result = shw.sayHWTime("morning") ;//Hello zs,morning
		assertEquals("Hello zs,morning", result);
	}
}
