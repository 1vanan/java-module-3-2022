package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyBean {
//    @Autowired
    private final TestBean testBean;

    public MyBean(TestBean testBean){
        this.testBean = testBean;

        System.out.println("Greetings from constructor!");
    }

    @PostConstruct
    private void init(){
        System.out.println("Hello from PostConstruct method!");
    }

    public void utilityMethod(){
        System.out.println("Hello from utility method!");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Hello from destroy method!");
    }
}
