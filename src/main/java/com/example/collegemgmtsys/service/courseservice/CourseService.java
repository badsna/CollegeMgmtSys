package com.example.collegemgmtsys.service.courseservice;

import com.example.collegemgmtsys.model.Course;
import com.example.collegemgmtsys.pojo.course.CourseDetailRequestPojo;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourse();
    public Optional<Course> getCourseById(Long course_id);
    public void saveCourseDetail(CourseDetailRequestPojo courseDetailRequestPojo);
}
