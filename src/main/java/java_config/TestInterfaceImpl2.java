package java_config;

import org.springframework.stereotype.Component;

@Component("test2")
public class TestInterfaceImpl2 implements TestInterface {

    @Override
    public void test1() {
        System.out.println("test2");
    }
}
