import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner1){
        this.todoList = list;
        this.scanner = scanner1;

    }
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String taskToAdd = scanner.nextLine();
                todoList.add(taskToAdd);
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int indexToRemove = Integer.valueOf(scanner.nextLine());
                todoList.remove(indexToRemove);

            }
        }
    }
}
