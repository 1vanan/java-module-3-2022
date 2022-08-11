package injection.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Bean2 {
    @Resource(name = "my very first bean!")
    private Bean1 bean1;

    public void startLoggingBean1(){
        bean1.logging();
    }
}
