package com.example.collegemgmtsys.controller;

import com.example.collegemgmtsys.model.Course;
import com.example.collegemgmtsys.pojo.course.CourseDetailRequestPojo;
import com.example.collegemgmtsys.service.courseservice.CourseServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/course")
public class CourseController {
    private final CourseServiceImpl courseServiceImpl;

    @Autowired
    public CourseController(CourseServiceImpl courseServiceImpl) {
        this.courseServiceImpl = courseServiceImpl;
    }

    @GetMapping
    public List<Course> getCourse(){
        return courseServiceImpl.getCourse();
    }

    @GetMapping("/{course_ig}")
    public Optional<Course> getCourseById(@PathVariable("course_ig") Long course_id){
        return courseServiceImpl.getCourseById(course_id);
    }

    @PostMapping
    public void saveCourseDetail(@RequestBody CourseDetailRequestPojo courseDetailRequestPojo){
        courseServiceImpl.saveCourseDetail(courseDetailRequestPojo);
    }
}
