package profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunProfilesApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev", "prod");

        ctx.register(ProdDataConfig.class);
        ctx.refresh();

        DevDataConfig dataConfig = ctx.getBean(DevDataConfig.class);
        dataConfig.setup();

        ctx.close();
    }
}
