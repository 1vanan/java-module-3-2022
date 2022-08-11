package injection.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("red")
public class Red implements Color{
    private String color;

    @Override
    public void setColor(String color) {
        if(! color.contains("red")){
            throw new IllegalArgumentException("the color is not kind of red!");
        }
        else {
            this.color = color;
        }
    }

    @Override
    public String getColor() {
        return color;
    }
}
