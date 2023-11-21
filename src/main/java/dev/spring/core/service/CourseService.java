package dev.spring.core.service;

import dev.spring.core.model.Course;
import org.springframework.stereotype.Service;
import dev.spring.core.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService<Course> {


    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
