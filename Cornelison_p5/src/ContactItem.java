public class ContactItem {
    String fName, lName, phone, email;

    public ContactItem(String fName, String lName, String phone, String email) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
    }

    public void viewContact() {
        System.out.println("Name: " + fName);
        System.out.println("Phone number: " + phone);
        System.out.println("Email: " + email);
        System.out.println("");
    }

}
