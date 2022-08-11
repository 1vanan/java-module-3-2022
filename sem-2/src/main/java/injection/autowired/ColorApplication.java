package injection.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ColorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ConfigurationContext.class);
        ctx.refresh();

        ColorCollector colorCollector = ctx.getBean(ColorCollector.class);

        colorCollector.setBlueColor("deep blue");
        colorCollector.setRedColor("light red");
    }
}
