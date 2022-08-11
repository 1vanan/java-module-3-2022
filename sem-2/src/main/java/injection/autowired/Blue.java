package injection.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("blue")
public class Blue implements Color{
    private String color;

    @Override
    public void setColor(String color) {
        if(! color.contains("blue")){
            throw new IllegalArgumentException("the color is not kind of blue!");
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
