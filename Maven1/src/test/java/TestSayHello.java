import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSayHello {
    @Test
    public void testSayHello() {
        sayHello sayhello = new sayHello();
        String result = sayhello.say("legend");
        assertEquals("hello legend", result);
    }
}
