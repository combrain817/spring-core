package dev.spring.core.repository;

import dev.spring.core.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {

        List<Course> courses = new ArrayList<>();

        Course course = new Course(1,
                "Getting started without spring",
                "Description",
                "https://www.naver.com");

        courses.add(course);

        return courses;
    }
}
