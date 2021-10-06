import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HelloWorldTest{
	@Test
	public void testHello(){
		HelloWorld hello = new HelloWorld();
		String result = hello.sayHello("zs");
		assertEquals("Hello zs",result);	//断言
	}
}