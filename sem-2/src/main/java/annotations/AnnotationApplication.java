package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AnnotationContextConfig.class);
        ctx.refresh();

        MyBean myBean = ctx.getBean(MyBean.class);
        TestBean testBean = ctx.getBean(TestBean.class);
        myBean.utilityMethod();

        ctx.close();
    }
}
