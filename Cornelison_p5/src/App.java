import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int menuChoice;
        boolean menuLoop = true;

        System.out.println("Select Your Application");
        System.out.println("-----------------------\n");
        System.out.println("1) Task List");
        System.out.println("2) Contact List");
        System.out.println("3) Quit\n");

        while (menuLoop) {
            menuLoop = false;
            menuChoice = menu.nextInt();

            if (menuChoice == 1) {
                TaskApp.taskMain();
            } else if (menuChoice == 2) {
                ContactApp.contactMain();
            } else if (menuChoice == 3) {
                System.exit(0);
            } else {
                menuLoop = true;
                System.out.println("Error: Invalid entry.");
            }
        }
    }

}
