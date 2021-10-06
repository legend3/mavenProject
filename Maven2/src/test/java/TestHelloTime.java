import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloTime {
    @Test
    public void testHelloTime() {
        sayHelloTime sayhellotime = new sayHelloTime();
        String result = sayhellotime.say("legend");
        assertEquals("hello legend morning", result);
    }
}
