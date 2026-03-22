import java.util.ArrayList;
import java.util.Scanner;

public class TodoListManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter new task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    System.out.println("\n📋 Your Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    if (updateIndex > 0 && updateIndex <= tasks.size()) {
                        System.out.print("Enter new task: ");
                        String newTask = sc.nextLine();
                        tasks.set(updateIndex - 1, newTask);
                        System.out.println("✏️ Task updated!");
                    } else {
                        System.out.println("❌ Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex > 0 && deleteIndex <= tasks.size()) {
                        tasks.remove(deleteIndex - 1);
                        System.out.println("🗑️ Task deleted!");
                    } else {
                        System.out.println("❌ Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}