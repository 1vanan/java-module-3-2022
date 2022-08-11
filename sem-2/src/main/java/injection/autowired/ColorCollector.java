package injection.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ColorCollector {
    final Color blue;
    final Color red;

    public ColorCollector(@Qualifier("blue") Color blue, @Qualifier("red") Color red) {
        this.blue = blue;
        this.red = red;
    }

    public void setRedColor(String color) {
        System.out.println("setting up color for the red bean: " + color);
        red.setColor(color);
    }

    public void setBlueColor(String color) {
        System.out.println("setting up color for the blue bean: " + color);

        blue.setColor(color);
    }
}
