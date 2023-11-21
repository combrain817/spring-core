package dev.spring.core;

import dev.spring.core.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dev.spring.core.service.CourseService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("appConfig.xml");
        CourseService courseService = applicationContext.getBean("courseService", CourseService.class);
        System.out.println(courseService.list());
    }
}
