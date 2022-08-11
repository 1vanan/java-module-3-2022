package factory;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanNameImpl implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println(String.format("Bean name is set up: ", beanName));
    }

    public String getBeanName() {
        return beanName;
    }
}
