package injection.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ContextConfig.class);
        ctx.refresh();

        Bean1 bean1 = ctx.getBean(Bean1.class);

        Bean2 bean2 = ctx.getBean(Bean2.class);
        Bean2 bean3 = ctx.getBean(Bean2.class);

        bean2.startLoggingBean1();
        bean3.startLoggingBean1();

        boolean checkBeans23 = bean2.hashCode() == bean3.hashCode();
        boolean checkBeans12 = bean1.hashCode() != bean2.hashCode();
        boolean checkBeans13 = bean1.hashCode() != bean3.hashCode();

        System.out.println("beans b2 and b3 are the same: " + checkBeans23);
        System.out.println("but beans b1 and b2 are not the same: " + checkBeans12);
        System.out.println("and beans b1 and b3 are also not the same: " + checkBeans13);

        ctx.close();
    }
}
