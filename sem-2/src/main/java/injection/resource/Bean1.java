package injection.resource;

import org.springframework.stereotype.Component;

@Component("my very first bean!")
public class Bean1 {
    public void logging() {
        System.out.println("Logging from bean 1 is started!");
    }
}
