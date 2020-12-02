public class TaskItem {
    String title, description, date;
    //boolean complete;

    public TaskItem(String title, String description, String date/*, boolean complete*/) {
        this.title = title;
        this.description = description;
        this.date = date;
        //this.complete = complete;
    }

    public void viewTask() {
        System.out.println("[" + date + "] " + title + ": " + description);
        System.out.println("");
    }

}
