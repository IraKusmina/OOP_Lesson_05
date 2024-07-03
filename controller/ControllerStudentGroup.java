package controller;

import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import service.StudentGroupService;

public class ControllerStudentGroup {
    StudentGroupService studentGroupService = new StudentGroupService();

    public void StudentGroup(Teacher teacher, List<Student> studentList){
        studentGroupService.setStudentGroup(teacher, studentList);
    }

    public StudentGroup getStudentGroup(){
        return studentGroupService.getStudentGroup();
    }
    
}
