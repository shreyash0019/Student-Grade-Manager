import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void searchStudent(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found!");
    }

    public void removeStudent(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                students.remove(student);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found!");
    }
}
