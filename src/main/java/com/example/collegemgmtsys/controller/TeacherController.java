package com.example.collegemgmtsys.controller;

import com.example.collegemgmtsys.model.Teacher;
import com.example.collegemgmtsys.pojo.teacher.TeacherDetailRequestPojo;
import com.example.collegemgmtsys.service.teacherservice.TeacherServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/teacher")
@Validated
public class TeacherController {
private final TeacherServiceImpl teacherServiceImpl;

@Autowired
    public TeacherController(TeacherServiceImpl teacherServiceImpl) {
        this.teacherServiceImpl = teacherServiceImpl;
    }

    @GetMapping
    public List<Teacher> getTeacher(){
        return teacherServiceImpl.getTeachers();
    }

    @GetMapping("{teacherId}")
    public Optional<Teacher> getTeacherById(@PathVariable("TeacherId") Long teacher_id){
    return  teacherServiceImpl.getTeacherById(teacher_id);
    }

    @PostMapping
    public void saveTeacherDetails(@RequestBody @Valid TeacherDetailRequestPojo teacherDetailRequestPojo){
    teacherServiceImpl.saveTeacherDetails(teacherDetailRequestPojo);
    }
}
