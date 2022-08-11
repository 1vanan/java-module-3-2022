package factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        MyBeanNameImpl myBeanName = ctx.getBean(MyBeanNameImpl.class);
        System.out.println(myBeanName.getBeanName());

        MyBeanFactoryImpl myBeanFactory = ctx.getBean(MyBeanFactoryImpl.class);
        myBeanFactory.getMyBeanName();
    }
}
