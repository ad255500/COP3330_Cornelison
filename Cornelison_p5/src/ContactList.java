import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class ContactList {

    private static ArrayList<ContactItem> array = new ArrayList<>();

    public static void edit(int select, String fName, String lName, String phone, String email) {
        ContactItem contactItem = new ContactItem(fName, lName, phone, email);
        array.set(select, contactItem);
    }

    public static void add(String fName, String lName, String phone, String email) {
        ContactItem contactItem = new ContactItem(fName, lName, phone, email);
        array.add(contactItem);
    }

    public static void view() {
        System.out.println("Current Contacts");
        System.out.println("----------------\n");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(i + ")");
            array.get(i).viewContact();
        }
    }

    public static void remove(int select) {
        array.remove(select);
    }

    static void save(String fileName) {
        try {
            File contactFile = new File(fileName);
            Scanner read = new Scanner(contactFile);
            int todo = Integer.parseInt(read.nextLine());
            for (int i = 0; i < todo; i++) {
                String fName = read.nextLine();
                String lName = read.nextLine();
                String phone = read.nextLine();
                String email = read.nextLine();
                array.add(new ContactItem(fName, lName, phone, email));
            }
            read.close();
            if (contactFile.createNewFile()) {
                System.out.println("Contact list has been saved");
            } else {
                System.out.println("Error: File already created");
            }
        } catch (IOException e) {
            System.out.println("Error: Unknown");
            e.printStackTrace();
        }
    }

}
