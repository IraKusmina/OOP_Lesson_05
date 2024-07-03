package service;

import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;

public class StudentGroupService {
    static StudentGroup studentGroup;
    
    public void setStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroup = new StudentGroup(teacher, studentList);
    }

    public StudentGroup getStudentGroup(){
        return studentGroup;
    }
}
