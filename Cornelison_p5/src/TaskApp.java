import java.util.Scanner;

public class TaskApp {

    public static void taskMain() {
        Scanner menu = new Scanner(System.in);
        int menuChoice;
        boolean menuLoop = true;

        System.out.println("Task List");
        System.out.println("---------\n");
        System.out.println("1) Create a new list");
        System.out.println("2) Load an existing list");
        System.out.println("3) Quit\n");

        while (menuLoop) {
            menuLoop = false;
            menuChoice = menu.nextInt();

            if (menuChoice == 1) {
                listOperations();
            } else if (menuChoice == 2) {
                listLoad();
            } else if (menuChoice == 3) {
                String[] args = new String[] {"args"};
                App.main(args);
            } else {
                menuLoop = true;
                System.out.println("Error: Invalid entry.");
            }
        }
    }

    private static void listOperations() {
        Scanner menu = new Scanner(System.in);
        int menuChoice;
        boolean menuLoop = true;

        while (menuLoop) {
            System.out.println("List Operation Menu");
            System.out.println("-------------------\n");
            System.out.println("1) View the list");
            System.out.println("2) Add an item");
            System.out.println("3) Edit an item");
            System.out.println("4) Remove an item");
            System.out.println("5) Mark an item as completed");
            System.out.println("6) Unmark an item as completed");
            System.out.println("7) Save tbe current list");
            System.out.println("8) Quit");

            menuChoice = menu.nextInt();

            if (menuChoice == 1) {
                TaskList.view();
            } else if (menuChoice == 2) {
                add();
            } else if (menuChoice == 3) {
                edit();
            } else if (menuChoice == 4) {
                remove();
            } else if (menuChoice == 5) {
                System.out.println("Error: Coming soon");
            } else if (menuChoice == 6) {
                System.out.println("Error: Coming soon");
            } else if (menuChoice == 7) {
                save();
            } else if (menuChoice == 8) {
                taskMain();
            } else {
                menuLoop = true;
                System.out.println("Error: Invalid entry");
            }
        }
    }

    private static void add() {
        String title, description, date;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task title: ");
        title = scanner.nextLine();
        System.out.println("Task description: ");
        description = scanner.nextLine();
        System.out.println("Task due date (YYYY-MM-DD): ");
        date = scanner.nextLine();

        TaskList.add(title, description, date);
    }

    private static void edit() {
        String title, description, date;
        Scanner scanner = new Scanner(System.in);
        int select;
        TaskList.view();

        System.out.println("Which task will you edit? ");
        select = scanner.nextInt();

        System.out.println("Enter a new title for task " + select + ": ");
        title = scanner.nextLine();
        System.out.println("Enter a new description for task " + select + ": ");
        description = scanner.nextLine();
        System.out.println("Enter a new due date (YYYY-MM-DD) for task " + select + ": ");
        date = scanner.nextLine();

        TaskList.edit(select, title, description, date);
    }

    private static void remove() {
        Scanner scanner = new Scanner(System.in);
        TaskList.view();
        int select;

        System.out.println("Which task will you remove? ");
        select = scanner.nextInt();

        TaskList.remove(select);
    }

    private static void save() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename to save as: ");
        String fileName = scanner.nextLine();
        TaskList.save(fileName);
    }

    private static void listLoad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename to load: ");
        String fileName = scanner.nextLine();
        /*
        Code here
        */
        System.out.println("Task list has been loaded");
    }

}
