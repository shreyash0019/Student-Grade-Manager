import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Grade Manager =====");
            System.out.println("1️⃣ Add Student");
            System.out.println("2️⃣ View All Students");
            System.out.println("3️⃣ Search Student by Roll No");
            System.out.println("4️⃣ Remove Student");
            System.out.println("5️⃣ Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    Map<String, Integer> subjects = new HashMap<>();
                    System.out.print("Enter number of subjects: ");
                    int numSubjects = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < numSubjects; i++) {
                        System.out.print("Enter Subject Name: ");
                        String subject = scanner.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = scanner.nextInt();
                        scanner.nextLine();
                        subjects.put(subject, marks);
                    }

                    manager.addStudent(rollNo, name, subjects);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = scanner.nextInt();
                    manager.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.print("Enter Roll No to Remove: ");
                    int removeRoll = scanner.nextInt();
                    manager.removeStudent(removeRoll);
                    break;

                case 5:
                    System.out.println("📌 Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid option! Please try again.");
            }
        }
    }
}
