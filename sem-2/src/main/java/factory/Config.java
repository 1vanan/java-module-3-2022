package factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "myCustomBeanName")
    public MyBeanNameImpl getMyBeanName() {
        return new MyBeanNameImpl();
    }

    @Bean
    public MyBeanFactoryImpl
    getMyBeanFactory() {
        return new MyBeanFactoryImpl();
    }
}
