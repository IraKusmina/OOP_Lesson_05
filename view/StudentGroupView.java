package view;

import java.util.List;

import controller.ControllerStudentGroup;
import model.Student;
import model.Teacher;
import model.StudentGroup;
import service.StudentGroupService;

public class StudentGroupView {
    private ControllerStudentGroup controllerStudentGroup = new ControllerStudentGroup();

    public void setStudentGroup(Teacher teacher1, List<Student>studentList){
        controllerStudentGroup.StudentGroup(teacher1, studentList);
        System.out.println("Преподаватель " + teacher1 + "и студенты \nсписок студентов: " + studentList + " добавлены в группу");
    }
    
    public StudentGroup getStudentGroup(StudentGroupService studentGroup){
        return controllerStudentGroup.getStudentGroup();
    }
}
