package repository;

import model.Course;

import java.util.ArrayList;
import java.util.List;

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
