package factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;

public class MyBeanFactoryImpl implements BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(org.springframework.beans.factory.BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void getMyBeanName(){
        MyBeanNameImpl myBeanName = beanFactory.getBean(MyBeanNameImpl.class);

        System.out.println("I just got my bean from the bean factory!");
        System.out.println(beanFactory.isSingleton("myCustomBeanName"));
    }
}
