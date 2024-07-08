import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoManager todoManager = new TodoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Todo");
            System.out.println("2. Complete Todo");
            System.out.println("3. Remove Todo");
            System.out.println("4. View Todos");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter todo description: ");
                    String description = scanner.nextLine();
                    todoManager.addTodo(description);
                    break;
                case 2:
                    System.out.print("Enter todo ID to complete: ");
                    int completeId = scanner.nextInt();
                    todoManager.markTodoAsCompleted(completeId);
                    break;
                case 3:
                    System.out.print("Enter todo ID to remove: ");
                    int removeId = scanner.nextInt();
                    todoManager.removeTodo(removeId);
                    break;
                case 4:
                    System.out.println("\nTodo List:");
                    for (Todo todo : todoManager.getTodos()) {
                        System.out.println(todo);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
