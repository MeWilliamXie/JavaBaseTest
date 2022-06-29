package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
        public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
        public void should_return_10(){
        BaseDemo baseDemo = new BaseDemo();
        int num1 = 5;
        int num2 = 5;
        baseDemo.sum(num1, num2);
    }

    @Test
    public void should_return_8(){
        BaseDemo baseDemo = new BaseDemo();
        int num1 = 3;
        int num2 = 5;
        baseDemo.sum(num1, num2);
    }
}
