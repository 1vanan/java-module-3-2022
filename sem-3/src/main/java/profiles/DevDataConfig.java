package profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataConfig implements DataSourceConfig{
    @Value("default dev config")
    String dataConfig;

    @Override public void setup() {
        System.out.println("Greetings from dev config: " + dataConfig);
    }
}
