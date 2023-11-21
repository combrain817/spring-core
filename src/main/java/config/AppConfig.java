package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.CourseRepository;
import service.CourseService;

@Configuration
public class AppConfig {

    @Bean
    public CourseRepository courseRepository() {
        return  new CourseRepository();
    }

    @Bean
    public CourseService courseService() {
        return new CourseService(courseRepository());
    }
}
