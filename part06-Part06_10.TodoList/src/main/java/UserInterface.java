import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList list, Scanner scanner1){
        this.scanner = scanner1;
        this.todoList = list;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")){
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String added = scanner.nextLine();
                todoList.add(added);

            } else if (command.equals("list")) {
                todoList.print();
                
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                todoList.remove(id);
                
            }
        }
    }
}
