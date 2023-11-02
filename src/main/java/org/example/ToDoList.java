import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isCompleted;

    Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }
}

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Todo List Options:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Task added!");
                    break;
                case 2:
                    System.out.print("Enter task number to remove: ");
                    int taskNumberToRemove = scanner.nextInt();
                    if (taskNumberToRemove >= 1 && taskNumberToRemove <= tasks.size()) {
                        tasks.remove(taskNumberToRemove - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumberToComplete = scanner.nextInt();
                    if (taskNumberToComplete >= 1 && taskNumberToComplete <= tasks.size()) {
                        Task task = tasks.get(taskNumberToComplete - 1);
                        task.isCompleted = true;
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 4:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        Task task = tasks.get(i);
                        System.out.println((i + 1) + ". " + task.description + " - " +
                                (task.isCompleted ? "Completed" : "Not Completed"));
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Todo List. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
