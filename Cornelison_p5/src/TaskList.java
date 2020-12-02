import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {

    private static ArrayList<TaskItem> array = new ArrayList<>();

    public static void edit(int select, String title, String description, String date) {
        TaskItem taskItem = new TaskItem(title, description, date);
        array.set(select, taskItem);
    }

    public static void add(String title, String description, String date) {
        TaskItem taskItem = new TaskItem(title, description, date);
        array.add(taskItem);
    }

    public static void remove(int select) {
        array.remove(select);
    }

    public static void view() {
        System.out.println("Current Tasks");
        System.out.println("-------------\n");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(i);
            array.get(i).viewTask();
        }
    }

    static void save(String fileName) {
        try {
            File taskFile = new File(fileName);
            Scanner read = new Scanner(taskFile);
            int todo = Integer.parseInt(read.nextLine());
            for (int i = 0; i < todo; i++) {
                String title = read.nextLine();
                String description = read.nextLine();
                String date = read.nextLine();
                //boolean complete = read.nextLine();
                array.add(new TaskItem(title, description, date/*, complete*/));
            }
            read.close();
            if (taskFile.createNewFile()) {
                System.out.println("Task list has been saved");
            } else {
                System.out.println("Error: File already created");
            }
        } catch (IOException e) {
            System.out.println("Error: Unknown");
            e.printStackTrace();
        }
    }

}
