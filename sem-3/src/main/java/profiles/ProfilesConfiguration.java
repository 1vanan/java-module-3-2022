package profiles;

import javax.servlet.ServletContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@ComponentScan("profiles")
public class ProfilesConfiguration implements WebApplicationInitializer {
    @Override public void onStartup(ServletContext servletContext){
        servletContext.setInitParameter("spring.profiles.active", "dev");
    }
}
