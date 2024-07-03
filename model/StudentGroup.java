package model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup extends User{
    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();
    
    public StudentGroup(Teacher teacher, List<Student> studentList){
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String toString(){
        return teacher + "\ncписок студентов:" + studentList;
    }




    


}
