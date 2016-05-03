package lessons;

import lessons.services.GreetingService;
import lessons.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ALEX on 03.05.2016.
 */
@Configuration
public class LessonsConfiguration {
    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
