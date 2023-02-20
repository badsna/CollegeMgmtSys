package com.example.collegemgmtsys.service.courseservice;

import com.example.collegemgmtsys.model.Course;
import com.example.collegemgmtsys.pojo.course.CourseDetailRequestPojo;
import com.example.collegemgmtsys.repo.CourseRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    public final CourseRepo courseRepo;
    public final CourseDetailRequestPojo courseDetailRequestPojo;
    public final ObjectMapper objectMapper;

    public List<Course> getCourse() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourseById(Long course_id) {
        boolean exists=courseRepo.existsById(course_id);
        if(!exists){
            throw new IllegalStateException("student with id "+ course_id +" does not exists");
        }
        return courseRepo.findById(course_id);
    }

    public void saveCourseDetail(CourseDetailRequestPojo courseDetailRequestPojo) {
        Course course;
        if(courseDetailRequestPojo.getCourse_id()!=null) {
            course = courseRepo.findById(courseDetailRequestPojo.getCourse_id()).orElse(new Course());
        }
       course=objectMapper.convertValue(courseDetailRequestPojo, Course.class);
        courseRepo.save(course);
    }
}
