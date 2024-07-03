

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.User;
import view.StudentGroupView;
import view.StudentView;

public class Main {

    public static void main(String[] args) {
        // User student1 = new Student("Григорий", 21, 101);
        // User student2 = new Student("Вячеслав", 22, 102);
        // User student3 = new Student("Марина", 20, 103);
        // User student4 = new Student("Анна", 19, 104);

        Teacher teacher1 = new Teacher("Валерий Семенович", 49, "Математика");
        
    
        // StudentView studentView1 = new StudentView();
        // studentView1.UserList(student1);  
        // studentView1.UserList(student2);
        // studentView1.UserList(student3);
        // studentView1.UserList(student4);

        Student student1 = new Student("Григорий", 21, 101);
        Student student2 = new Student("Вячеслав", 22, 102);
        Student student3 = new Student("Марина", 20, 103);
        Student student4 = new Student("Анна", 19, 104);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        StudentGroupView studentGroupView = new StudentGroupView();
        studentGroupView.setStudentGroup(teacher1, studentList);        
    }
  
}
