package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     TaskManagesr taskManagesr = new TaskManagesr();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Mark as completed");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("enter Task description:");
                    String description = scanner.nextLine();
                    taskManagesr.addTask(description);
                    break;
                case 2:
                    taskManagesr.listTasks();
                    break;
                case 3:
                    System.out.println("Enter Task number to remove:");

                    int removeIndex = scanner.nextInt();
                    taskManagesr.removeTask(removeIndex);
                    break;

                case 4:
                    System.out.println("Enter Task Number to mark as completed:");
                    int completeIndex = scanner.nextInt();
                    taskManagesr.markTaskCompleted(completeIndex);
                    break;

                case 5:
                    System.out.println("exit Bye");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice please try again");

            }


        }


    }
}