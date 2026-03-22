import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Filter (Marks > 50)");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(id, name, marks));
                    System.out.println("✅ Student added!");
                    break;

                case 2:
                    System.out.println("\n📋 Student List:");
                    for (Student s : students) {
                        System.out.println(s.id + " | " + s.name + " | " + s.marks);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.id == searchId) {
                            System.out.println("🔍 Found: " + s.name + " | " + s.marks);
                            found = true;
                        }
                    }

                    if (!found) System.out.println("❌ Not found");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    for (Student s : students) {
                        if (s.id == updateId) {
                            sc.nextLine();
                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextInt();

                            System.out.println("✏️ Updated!");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    students.removeIf(s -> s.id == deleteId);
                    System.out.println("🗑️ Deleted!");
                    break;

                case 6:
                    System.out.println("\n🎯 Students with marks > 50:");
                    for (Student s : students) {
                        if (s.marks > 50) {
                            System.out.println(s.name + " | " + s.marks);
                        }
                    }
                    break;

                case 7:
                    System.out.println("👋 Exit");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}