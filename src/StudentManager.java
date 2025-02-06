import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(int rollNo, String name, Map<String, Integer> subjects) {
        students.add(new Student(rollNo, name, subjects));
        System.out.println("✅ Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found!");
            return;
        }
        students.forEach(Student::displayStudentInfo);
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                s.displayStudentInfo();
                return;
            }
        }
        System.out.println("❌ Student with Roll No " + rollNo + " not found!");
    }

    public void removeStudent(int rollNo) {
        students.removeIf(s -> s.getRollNo() == rollNo);
        System.out.println("✅ Student removed successfully!");
    }
}
