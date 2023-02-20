package com.example.collegemgmtsys.service.teacherservice;

import com.example.collegemgmtsys.model.Teacher;
import com.example.collegemgmtsys.pojo.teacher.TeacherDetailRequestPojo;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
List<Teacher> getTeachers();
    public Optional<Teacher> getTeacherById(Long teacher_id);
    public void saveTeacherDetails(TeacherDetailRequestPojo teacherDetailRequestPojo);
}
