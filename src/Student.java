import java.util.*;

public class Student {
    private int rollNo;
    private String name;
    private Map<String, Integer> subjects;
    private double percentage;
    private char grade;

    public Student(int rollNo, String name, Map<String, Integer> subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.subjects = subjects;
        calculateResults();
    }

    private void calculateResults() {
        int totalMarks = subjects.values().stream().mapToInt(Integer::intValue).sum();
        int totalSubjects = subjects.size();
        this.percentage = totalMarks / (double) totalSubjects;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else if (percentage >= 35) grade = 'D';
        else grade = 'F';
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public double getPercentage() { return percentage; }
    public char getGrade() { return grade; }

    public void displayStudentInfo() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Subjects & Marks: " + subjects);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
