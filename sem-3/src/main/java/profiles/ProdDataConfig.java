package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDataConfig implements DataSourceConfig{
    @Override public void setup() {
        System.out.println("Prod config");
    }
}
