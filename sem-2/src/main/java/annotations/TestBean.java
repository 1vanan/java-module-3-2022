package annotations;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public TestBean(){
        System.out.println("Greetings from the constructor of TestBean!");
    }
}
