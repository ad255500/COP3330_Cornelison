import java.util.Scanner;

public class ContactApp {

    public static void contactMain() {
        Scanner menu = new Scanner(System.in);
        int menuChoice;
        boolean menuLoop = true;

        System.out.println("Contact List");
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
            System.out.println("5) Save tbe current list");
            System.out.println("6) Quit");

            menuChoice = menu.nextInt();

            if (menuChoice == 1) {
                ContactList.view();
            } else if (menuChoice == 2) {
                add();
            } else if (menuChoice == 3) {
                edit();
            } else if (menuChoice == 4) {
                remove();
            } else if (menuChoice == 5) {
                save();
            } else if (menuChoice == 6) {
                contactMain();
            } else {
                System.out.println("Error: Invalid entry");
            }
        }
    }

    private static void save() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename to save as: ");
        String fileName = scanner.nextLine();
        ContactList.save(fileName);
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

    private static void remove() {
        Scanner scanner = new Scanner(System.in);
        ContactList.view();
        int select;

        System.out.println("Which contact will you remove? ");
        select = scanner.nextInt();

        ContactList.remove(select);
    }

    private static void add() {
        String fName, lName, phone, email;
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        fName = scanner.nextLine();
        System.out.println("Last name: ");
        lName = scanner.nextLine();
        System.out.println("Phone number (xxx-xxx-xxxx): ");
        phone = scanner.nextLine();
        System.out.println("Email address (x@y.z): ");
        email = scanner.nextLine();

        ContactList.add(fName, lName, phone, email);
    }

    private static void edit() {
        String fName, lName, phone, email;
        Scanner scanner = new Scanner(System.in);
        int select;
        ContactList.view();

        System.out.println("Which contact will you edit? ");
        select = scanner.nextInt();

        System.out.println("Enter a new first name for contact" + select + ": ");
        fName = scanner.nextLine();
        System.out.println("Enter a new last name for contact " + select + ": ");
        lName = scanner.nextLine();
        System.out.println("Enter a new phone number (xxx-xxx-xxxx) for contact " + select + ": ");
        phone = scanner.nextLine();
        System.out.println("Enter a new email address (x@y.z) for contact " + select + ": ");
        email = scanner.nextLine();

        ContactList.edit(select, fName, lName, phone, email);
    }
}
