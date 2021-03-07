package java_config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("test1")
public class TestInterfaceImpl1 implements TestInterface {

    @Override
    public void test1() {
        System.out.println("test1");
    }
}
