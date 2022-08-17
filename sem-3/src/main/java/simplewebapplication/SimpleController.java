package simplewebapplication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/russia")
    public String helloWeb(){
        return "Moscow";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello web world again!";
    }

    @RequestMapping("/sum/{id}")
    public String helloWithParams(@PathVariable String id){
        return String.format("Hello with id: %s", id);
    }
}
